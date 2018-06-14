pipeline {
  agent any
  tools { 
    maven 'maven'
  }
  stages {
    stage('Test') {
      steps {
        bat 'mvn clean test'
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
