pipeline {
  agent any
  stages {
    stage('Github Checkout') {
      steps {
        echo 'Revisando modificaciones en el repositorio'
      }
    }
    stage('Run Tests') {
      steps {
        echo 'Corriendo los tests con maven'
      }
    }
  }
  tools {
    maven 'maven'
  }
}