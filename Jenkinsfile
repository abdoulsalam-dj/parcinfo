pipeline {
    agent any
    stages {
        stage(‘Build’) {
            steps {
                 sh "/D:/M2/Nouveau dossier/apache-maven-3.8.6/bin/mvn clean package"
            }
        }
        stage(‘Test’) {
            steps {
                 sh "/D:/M2/Nouveau dossier/apache-maven-3.8.6/bin/mvn test"
            }
        }
        
        
       
    }
}
