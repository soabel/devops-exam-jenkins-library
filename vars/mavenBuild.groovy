def call(Map stageParams) {
    sh "echo $WORKSPACE"
    sh "echo image param: ${stageParams.image}"
    sh "mvn clean install"
}