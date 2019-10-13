pipeline{
agent any

stages{

    stage ('Compile Stage'){
        steps{
            withMaven(maven : 'Maven_3.5.2') {
                bat 'mvn clean compile'
            }
        }
    }

    stage('Testing Stage'){
        steps{
            withMaven(maven : 'Maven_3.5.2') {
            bat 'mvn test'
            }
        }
    }
    stage('Installation'){
            steps{
                withMaven(maven : 'Maven_3.5.2') {
                bat 'mvn install'
                }
            }
        }

}

}