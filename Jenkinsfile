pipeline {
    agent {
        docker { image 'node:7-alpine' }
    }
    stages {
        stage('Build') {
            steps {
                sh 'sh gradlew build'
            }
        }
        stage('Node') {
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
