pipeline {

    environment {

     springF="achat_back"   
     angularF="achat_front"    
   }

          agent any

          stages{
/*
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
*/

        //     stage('Testing..') {
        //         steps {
        //         sh 'cd ${springF} && mvn test'
        //     }
        // }

        
             stage("Nexus deploy"){
                steps{
                     script{
                        nexusArtifactUploader artifacts: [[artifactId: 'achat', classifier: '', file: 'achat_back/target/achat-1.0.jar', type: 'jar']], credentialsId: 'nexus_cred', groupId: 'tn.esprit.rh', nexusUrl: '192.168.1.225:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'devops', version: '1.0'
                     }
                    }

                }

           


    }
}
