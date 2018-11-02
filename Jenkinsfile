@Library('jenkins-shared-libraries@v1.4') _

pipeline{

    agent { node { label 'master' } }
    stages {

        stage('Send slack correct notification as script'){

            steps {
                echo "Success"
	    	echo "${env.JOB_NAME}"
            }

        }


	    
    }
	post {
		always{
			script{
				env.JOB_NAME == 'master' ?  echo 'yes' : echo 'no'
			}
		}
		
	}

}
