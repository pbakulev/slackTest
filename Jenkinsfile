@Library('jenkins-shared-libraries@v1.4') _

pipeline{

    agent { node { label 'master' } }
    stages {

        stage('Send slack correct notification as script'){

            steps {
                echo "Success"
		    
            }

        }


	    
    }
	post {
		always{
			script{
				env.BRANCH_NAME == 'master' ?  echo 'yes' : echo 'no'
			}
		}
		
	}

}
