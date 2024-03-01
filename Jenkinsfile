pipeline {
  agent any
  environment {
  PATH = "${env.PATH};C:\\Windows\\System32"
  //GIT_CREDENTIALS = credentials('Vladimir')
  }
stages {
  stage('Checkout') {
    steps {
      git branch: 'main', credentialsId: 'metropolia', url: 'https://github.com/VladimirPiniazhin/FarToCel.git/'

      }
    }
  stage('Build') {
    steps {
      bat 'mvn clean install'
      }
    }
  stage('Test') {
    steps {
      bat 'mvn test'
      }
  post {
    success {
      junit '**/target/surefire-reports/TEST-*.xml'
      jacoco(execPattern: '**/target/jacoco.exec')
    }
  }
}
}
