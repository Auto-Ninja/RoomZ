pipeline {
    agent any
    environment {
        APPURL="http://someurl"
        APPENVIRONMENT="Dev"
    }
    stages{
        stage('Build')
        {
            steps
            {
                echo 'Buidling the application for %APPENVIRONMENT% environment'
                echo 'Appplication base url %APPURL%'
            }
        }
    }
}