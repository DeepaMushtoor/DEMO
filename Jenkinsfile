pipeline {
    agent any

    tools {
        maven 'MAVEN'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/DeepaMushtoor/DEMO.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed.'
        }
        success {
            echo 'Build Successful!'
        }
        failure {
            echo 'Build Failed!'
        }
    }
}