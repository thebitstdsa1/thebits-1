pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        echo 'Build'
        echo 'Hola'
      }
    }
    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            echo 'Deploy'
            sh 'mvn verify'
          }
        }
        stage('Notify') {
          steps {
            echo 'Notificacion'
          }
        }
      }
    }
  }
}
