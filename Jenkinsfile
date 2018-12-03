@Library('jenkins-shared-libraries@v1.4') _

pipeline{

    agent { node { label 'master' } }
    stages {

        stage('Show env'){

            steps {
                echo sh(returnStdout: true, script: 'env')
            }

        }


	    
    }
	

}
