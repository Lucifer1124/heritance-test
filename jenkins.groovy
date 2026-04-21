pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Lucifer1124/heritance-test.git'
            }
        }
        stage('Compile') {
            steps {
                sh 'javac test.java'
                echo 'Compilation done great yo'
            }
        }
        stage('Run') {
            steps {
                sh 'java test'
            }
        }
    }
}
