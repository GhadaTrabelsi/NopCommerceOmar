pipeline {
  agent any
  stages {
    stage('Test') {
 
      parallel {
        stage('Maven') {
          steps {
            echo 'Running from Jenkins file'
            bat 'mvn  clean install'
          }
        }
 
        stage('Cucumber') {
          steps {
            cucumber '**/*.json'
          }
        }
 
      }
    }
 
  }
}