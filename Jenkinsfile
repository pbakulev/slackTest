@Library('jenkins-shared-libraries@abort-previous-builds') _

pipeline{

    agent { node { label 'master' } }
    stages {
	stage(''){
		steps {
			abortPreviousBuilds()
		}
	}
        stage('Timeout'){

            steps {
		    sh 'sleep 30s'
            }

        }
	    
    }	

}
