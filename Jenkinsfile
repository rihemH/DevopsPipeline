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
         stage('testing java version') {
            steps {
                sh """java -version"""
            }
        }
          stage('Clean package') {
            steps {
                sh 'mvn clean'
            }
        }
        

    }
}
