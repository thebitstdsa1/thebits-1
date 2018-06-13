pipeline {
  agent any
  tools { 
    maven 'maven'
  }
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
}
