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
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
     }
        stage('Clean et install') { 
            steps {
                sh 'mvn clean install' 
            }
     }
        
        stage("mvn Package") {
            steps {
               
                    sh 'mvn package'  
            }
        }
       
        
        stage("docker build") {
                       steps{
                         script {
                             dockerImage = docker.build registry + ":$BUILD_NUMBER"
                       }
                 }
    }
}
