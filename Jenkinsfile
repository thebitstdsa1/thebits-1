pipeline {
  agent any
  stages {
    stage('Github Checkout') {
      steps {
        echo 'Revisando modificaciones en el repositorio'
      }
    }
    stage('Run Tests Automáticos') {
      tools {
        maven 'maven'
      }
      steps {
        echo 'Corriendo los tests con maven'
        bat 'mvn clean test'
      }
    }
    stage('Deploy para Test Humano') {
      steps {
        echo 'Enviar al entorno de Producción para Test Humanos'
      }
    }
    stage('Slacks') {
      steps {
        echo 'Notificaciones al canal de Slack del equipo'
      }
    }
  }
}
