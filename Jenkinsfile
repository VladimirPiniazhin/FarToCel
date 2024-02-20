pipeline {
  agent any
  environment {
    PATH="${env.PATH};C:\\Windows\\System32"
  }
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', credentialsId: 'metropolia', url: 'https://github.com/VladimirPiniazhin/FarToCel.git/'
      }
    }
  }
}
pipeline { //This line marks the beginning of the pipeline block.
agent any //This specifies that the pipeline can be executed on any available agent (or executor) in the Jenkins environment.
environment { // Starts the environment block, where you can define environment variables for the pipeline.
PATH = "${env.PATH};C:\\Windows\\System32" // This line updates the PATH environment variable to include the directory of cmd.exe on a Windows system. It concatenates the existing PATH with C:\Windows\System32.
//GIT_CREDENTIALS = credentials('ADirin') // This sets the environment variable GIT_CREDENTIALS to thecredentials stored in Jenkins with the ID 'ADirin'.
} //Closes the environment block.
stages { // Starts the stages block, where you define the different stages of the pipeline.
stage('Checkout') { // Defines the first stage of the pipeline, named 'Checkout'.
steps { // Starts the steps block for the 'Checkout' stage.
git branch: 'main', credentialsId: 'metropolia', url: 'https://github.com/VladimirPiniazhin/FarToCel.git/' // This step checks out the 'master' branch of the Git
//repository located at the specified URL using the credentials stored in Jenkins with the ID 'ADirin'.
} // Closes the steps block for the 'Checkout' stage.
} //Closes the stage block for the 'Checkout' stage.
stage('Build') { //Defines the second stage of the pipeline, named 'Build'.
steps { //Starts the steps block for the 'Build' stage.
bat 'mvn clean install' //This step executes a Maven command (mvn clean install) using the Windows batch script.
} //Closes the steps block for the 'Build' stage.
} //Closes the stage block for the 'Build' stage.
stage('Test') { //Defines the third stage of the pipeline, named 'Test'.
steps { // Starts the steps block for the 'Test' stage.
bat 'mvn test' //This step executes the Maven command mvn test using the Windows batch script.
} //Closes the steps block for the 'Test' stage.
post { // Starts the post block, which contains actions to be performed after the stage is completed.
success { //Specifies that the actions inside this block should only be executed if the stage is successful.
  junit '**/target/surefire-reports/TEST-*.xml' //This publishes JUnit test results by specifying the file pattern for the XML reports generated by Maven Surefire plugin.
  jacoco(execPattern: '**/target/jacoco.exec') //This generates JaCoCo code coverage report by specifying the file pattern for the JaCoCo execution data.
} //Closes the success block.
} //Closes the post block.
} //Closes the stages block.
} //Closes the pipeline block.
