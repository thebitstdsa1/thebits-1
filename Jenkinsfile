pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build'
      }
    }
    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            echo 'Deploy'
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