pipeline{
    agent any
    stages{
        stage("---Clean stage---"){
            steps{
                bat "mvn clean"
            }
        }
        stage("---Compile stage---"){
            steps{
                bat "mvn compile"
            }
        }
        stage("---Build stage---"){
            steps{
                bat "mvn install"
            }
        }
        stage ("---Test stage---"){
            steps{
                echo "---Testing stage---"
            }
        }
    }
}