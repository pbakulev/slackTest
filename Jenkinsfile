@Library('jenkins-shared-libraries@test') _

pipeline{

    agent { node { label 'master' } }
    stages {

        stage('Send slack correct notification as script'){

            steps {
                echo "Success"
	        echo "${imageName()}"
		echo imageName()
		echo imageName		
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
