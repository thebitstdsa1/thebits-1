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
      }
    }
    stage('Deploy para Test Humano') {
      steps {
        echo 'Enviar al entorno de Producción para Test Humanos'
      }
    }
  }
  tools {
    maven 'maven'
  }
}