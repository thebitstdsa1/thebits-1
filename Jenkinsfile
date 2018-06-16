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
        slackSend (channel: '#presentacion-tdsa', color: '#FFFF00', message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.RUN_DISPLAY_URL})")
        bat 'mvn clean test'
      }
    }
    stage('Deploy para Stagging') {
      steps {
        echo 'Enviar al entorno de Producción'
        bat 'mvn install'
        //sh 'mvn install'
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
    jdk   'jdk8'
  }
  
  post {
    failure {
      slackSend (channel: '#presentacion-tdsa', color: '#FF0000', message: "FAILURE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.RUN_DISPLAY_URL})")
      }
    success {
      slackSend (channel: '#presentacion-tdsa', color: '#5FB404', message: "SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.RUN_DISPLAY_URL})")
      archive "target/**/*"
      junit 'target/surefire-reports/*.xml'
      }
    always {
      junit 'target/surefire-reports/*.xml'
    }
  }
}
