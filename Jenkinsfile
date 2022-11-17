pipeline {

    environment {

     springF="achat_back"   
     angularF="achat_front"    
   }

          agent any

          stages{

            stage('Cleaning and install ') {

                steps {
                sh ' cd ${springF} && mvn clean install -DskipTests'
            }
        }



            stage('Compiling..') {
                steps {
                sh 'cd ${springF} && mvn compile'
            }
        }

        stage('MVN SONARQUBE')
            {
                steps{
                sh 'cd ${springF} && mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=1111'
                }
            }


        //     stage('Testing..') {
        //         steps {
        //         sh 'cd ${springF} && mvn test'
        //     }
        // }



           


    }
}
