pipeline{
agent any

stages{

    stage ('Compile Stage'){
        steps{
            withMaven(maven: 'maven_3_5_2'){
            sh 'mvn clean compile'
            }
        }
    }

    stage('Testing Stage'){
        steps{
            withMaven(maven: 'maven_3_5_2'){
            sh 'mvn test'
            }
        }
    }
    stage('Installation'){
            steps{
                withMaven(maven: 'maven_3_5_2'){
                sh 'mvn install'
                }
            }
        }

}

}