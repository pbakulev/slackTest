@Library('jenkins-shared-libraries@dev_test') _

pipeline{

    agent { node { label 'master' } }
    stages {

        stage('Show env'){

            steps {
		    echo "${commitId()}"
            }

        }
	    
    }
	

}
