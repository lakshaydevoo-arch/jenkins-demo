
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Repository checkout completed'
            }
        }

        stage('Check Java') {
            steps {
                sh 'java -version'
                sh 'javac -version'
            }
        }

        stage('Compile') {
            steps {
                sh 'javac HelloWorld.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java HelloWorld'
            }
        }
    }
}
