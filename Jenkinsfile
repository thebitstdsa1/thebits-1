pipeline {
  agent any
  tools {
    maven 'maven 3.3.9'
    jdk 'jdk8'
  }
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
