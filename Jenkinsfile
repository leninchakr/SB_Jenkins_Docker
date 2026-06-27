pipeline {
    agent any

    environment {
        IMAGE_NAME = "sb-dock-test"
        CONTAINER_NAME = "sb-dock"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/leninchakr/SB_Jenkins_Docker.git'
            }
        }

        stage('Build JAR') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t sb-dock-test:latest .'
            }
        }

        stage('Stop Old Container') {
            steps {
                sh 'docker rm -f sb-dock || true'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 9091:9091 --name sb-dock sb-dock-test:latest'
            }
        }
    }
}