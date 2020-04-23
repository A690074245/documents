pipeline{
    agent any
    tools{
        maven 'maven'
        jdk 'java'
    }

    stages{
        stage('Build'){
            steps{
                sh ""
                sh "mvn clean package -Dmaven.test.skip=true docker:build"
            }
        }
    }
}
