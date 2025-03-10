pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add build commands here based on your project type
                // For example, if it's a Java project:
                // sh 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test commands here
                // Example: sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add deployment commands
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline execution failed!'
        }
    }
}
