pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
               git branch: 'main',
               url: 'https://github.com/rihemH/DevopsPipeline' 
                
            }
        }
        stage('Clean package') {
            steps {
               echo 'cleaning project ...'
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
