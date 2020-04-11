def call(Map stageParams) {
    sh "echo pwd"
    sh "echo $WORKSPACE"
    sh "echo image: ${stageParams.image}"
    sh "mvn clean install"
}