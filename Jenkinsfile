pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean test'
      }
    }
    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            echo 'hola'
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
  tools {
    maven 'maven'
  }
}