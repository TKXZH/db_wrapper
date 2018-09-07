pipeline {
    agent any
    stages {
        stage('Deploy') {
            steps {
                timeout(time: 1, unit: 'MINUTES') {
                    sh './gradlew build'
                }
            }
            sh 'ls -lh'
        }
    }
}