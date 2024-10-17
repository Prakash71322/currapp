pipeline {
    agent any
   
    stages {
        stage('Build') {
            steps {
                echo 'I run maven package target'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying to tomcat'
            }
        }
    }
}