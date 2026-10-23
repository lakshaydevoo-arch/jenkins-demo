
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

        stage('Verify Output') {
            steps {
                script {
                    def output = sh(
                        script: 'java HelloWorld',
                        returnStdout: true
                    ).trim()

                    if (!output.contains('Hello')) {
                        error 'Verification failed: expected output containing Hello'
                    }

                    echo 'Verification passed!'
                }
            }
        }
    }
}
