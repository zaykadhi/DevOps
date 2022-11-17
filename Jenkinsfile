pipeline {

    environment {

     springF="achat_back"   
     angularF="achat_front"    
   }

          agent any

          stages{

            stage('Cleaning and install ') {

                steps {
                sh ' cd ${springF} && mvn clean install'
            }
        }



            stage('Compiling..') {
                steps {
                sh 'cd ${springF} && mvn compile'
            }
        }


        //     stage('Testing..') {
        //         steps {
        //         sh 'cd ${springF} && mvn test'
        //     }
        // }



           


    }
}
