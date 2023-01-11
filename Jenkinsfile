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
        stage("mvn Deploy") {
            steps {
               
                    sh 'mvn clean package deploy:deploy-file -DgroupId=com.esprit.examen -DartifactId=tpAchatProject -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://192.168.1.8:8081//repository/maven-releases/ -Dfile=target/tpAchatProject-1.0.jar'  
            }
        }
        

    }
}
