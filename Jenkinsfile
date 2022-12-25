pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
               git branch: 'main',
               url: 'https://github.com/rihemH/DevopsPipeline' 
                
            }
        }
        stage('testing maven') {
            steps {
                sh """mvn -version"""
            }
        }
          stage('Clean package') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
     }
    }
}
