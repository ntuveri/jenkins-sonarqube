pipeline {
    agent any

    stages {
        stage('Hello world') {
            steps {
                script {
                    echo "This build is based on Jenkinsfile"
                }
            }
        }
		stage('Print env vars') {
            steps {
                script {
                    sh "env"
                }
            }
        }
    }
}
