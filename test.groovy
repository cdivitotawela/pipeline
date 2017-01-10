def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    echo 'Build Config: ' + config

    callInternal(config)

}


def callInternal(config) {

    node('generic'){
        stage "Initialize"
        echo "Running initialize"
    }
}


