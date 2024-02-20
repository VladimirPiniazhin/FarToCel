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
