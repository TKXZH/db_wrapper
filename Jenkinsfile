pipeline {
    agent any
    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE    = 'sqlite'
    }
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
        always {
            junit 'build/test_results/**/*.xml'
        }
        success {
                    echo 'This will run only if successful'
        }
    }
}
