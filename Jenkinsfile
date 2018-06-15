pipeline {
  agent any
   tools {
     maven  'maven'
     //jdk    'jdk8'
      }
  stages {
    stage('Github Checkout') {
      steps {
        echo 'Revisando modificaciones en el repositorio'
      }
    }
    stage('Run Tests Automáticos') {
      steps {
        echo 'Corriendo los tests con maven'
        bat 'mvn clean test'
      }
    }
    stage('Deploy para Test Humano') {
      steps {
        echo  'Enviar al entorno de Producción'
        bat   'mvn deploy:deploy-file'
      }
    }
    stage('Slacks') {
      steps {
        echo 'Notificaciones al canal de Slack del equipo'
      }
    }
  }
}
