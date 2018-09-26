@Library('jenkins-shared-libraries@dev_test') _

pipeline{

    agent { node { label 'master' } }
    stages {

        stage('Send slack correct notification as script'){

            steps {
                echo "Success"
				currentBuild.currentResult = "ABORTED"
            }

        }


    }
	post {
		always{
			slack('#jenkins_test')
		}
		
	}

}