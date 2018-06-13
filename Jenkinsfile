pipeline {
  agent any
  tools { 
        maven 'maven'  
    }
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean'
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
