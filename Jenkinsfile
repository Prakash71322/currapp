pipeline {
    agent any
   
    stages {
        stage('Build') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying to tomcat'
            }
        }
    }
}