pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'sh gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh 'free'
            }
        }
        stage('final') {
            steps {
                sh 'ps -ef'
            }
        }
    }
}
