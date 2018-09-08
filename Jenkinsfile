pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'sh gradlew build'
            }
        }
        stage('Env') {
            steps {
                sh 'printenv'
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
