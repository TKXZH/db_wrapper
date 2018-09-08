pipeline {
    agent {

    }
    stages {
        stage('Build') {
            steps {
                docker { image 'node:7-alpine' }
            }
        }
        stage('Test') {
             steps {
                   sh 'node --version'
             }
        }
        stage('Test') {
            steps {
                sh 'free -h'
            }
        }
        stage('final') {
            steps {
                sh 'ps -ef'
            }
        }
    }
    post {
         success {
                    echo 'This will run only if successful'
         }
    }
}
