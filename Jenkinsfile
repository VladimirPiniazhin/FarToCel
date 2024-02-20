pipeline {
  agent any
  enviroment {
    PATH="${env.PATH};C:\\Windows\\System32"
    GIT_CREDENTIALS=credentials('VladimirPiniazhin')
  }
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', credentialsId: 'VladimirPiniazhin', url: 'https://github.com/VladimirPiniazhin/FarToCel.git/
      }
    }
  }
}
