pipeline {
    agent any

    stages {
        stage('Hello world') {
            steps {
                echo "This build is based on Jenkinsfile"
            }
        }
		stage('Print env vars') {
            steps {
                withSonarQubeEnv('Local SonarQube') {
                    sh "env"
                }
            }
        }
    }
}
