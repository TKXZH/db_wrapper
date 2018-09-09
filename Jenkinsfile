#!groovy
pipeline {
    agent any
    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE    = 'sqlite'
    }
    stages {
        stage('Build') {
            steps {
                sh 'sh gradlew clean build'
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
                input "Does the staging environment look ok?"
            }
        }
    }
    post {
        always {
            junit 'build/test-results/**/*.xml'
        }
        success {
                    echo 'This will run only if successful'
        }
    }
}
