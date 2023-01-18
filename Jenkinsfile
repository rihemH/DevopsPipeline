pipeline {
     environment{
      registry="hamza1991/tpachatprojctbackend"
      registryCredential='hamza-dockerhub'
      dokerImage="tpachatprojctbackend"
      PATH = "$PATH:/usr/local/bin"
     

 }
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
       
         stage("docker push") {
           steps{
              script {
                docker.withRegistry( '', registryCredential ) {
                dockerImage.push()
             }
           }
       }
      }  
       stage("DockerHub login ") {
              steps{
                  sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u hamza1991 -p Hamzasarrajoacaatc'
            }
          }
          stage('Docker-compose file') {

              steps {
                   sh 'docker-compose up -d';
                    sh 'sleep 300'
             
             }  
        }
        
    }
}
