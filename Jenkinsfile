pipeline {
  agent any
  stages {
    stage('Github Checkout') {
      steps {
        echo 'Revisando modificaciones en el repositorio'
      }
    }
    stage('Run Tests Automáticos') {
      steps {
        echo 'Corriendo los tests con maven'
        sh 'mvn clean test'
      }
    }
    stage('Deploy para Test Humano') {
      steps {
        echo 'Enviar al entorno de Producción'
        bat 'mvn install'
      }
    }
    stage('Slacks') {
      steps {
        echo 'Notificaciones al canal de Slack del equipo'
      }
    }
  }
  tools {
    maven 'maven'
  }
}