@Library('jenkins-shared-libraries@v1.1') _

pipeline{

    agent { node { label 'master' } }
    stages {

        stage('Send slack correct notification as script'){

            steps {
                echo "Failure"
		error 'Some error'
				
            }

        }


    }
	post {
		always{
			slack channel:'#jenkins_test', allure: 'y'
			slack channel:'#jenkins_test', allure: 'no'
		}
		
	}

}
