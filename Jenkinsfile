pipeline{
    agent any
    tools{
        maven 'maven'
        jdk 'java'
    }

    stages{
        stage('Build'){
            steps{
                sh "docker login"
                sh "mvn clean package -Dmaven.test.skip=true docker:build"
            }
        }
    }
}
