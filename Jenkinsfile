pipeline {
    agent any

    stages {
         stage('Build artifact') {
            steps{
               sh 'mvn clean package -DskipTest=true'
            }
 
        }
         stage('Test du projet') {
            steps{
               sh 'mvn test'
            }
 
        }
         stage('Build Docker Image and push ') {
            steps {
                
                withDockerRegistry([credentialsId: "noadi_docker_hub", url: ""]) {
                      sh 'docker build -t adingra721/ansible-demo:$BUILD_NUMBER .'
                      sh 'docker push adingra721/ansible-demo:$BUILD_NUMBER'
                }
            }
        }
        stage('Deploy Image') {
            steps{
               sh 'docker stop ansible-demo || true'
               sh 'docker rm ansible-demo || true'
               sh 'docker run -p 8180:8180 -d --name ansible-demo ansible-demo'
               
            }
 
        }
    }
}
