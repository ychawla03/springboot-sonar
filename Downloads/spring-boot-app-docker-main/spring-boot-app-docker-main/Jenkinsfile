pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Build your Spring Boot application
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run your unit tests
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy your Spring Boot application
                sh 'mvn deploy'
            }
        }
    }
}