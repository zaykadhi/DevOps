pipeline {

    environment {

     springF="achat_back"   
     angularF="achat_front"
     DOCKERHUB_CREDENTIALS=credentials('dockerhub_cred')    
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

          
*/

         stage('Build images') {
                 steps {

                sh "docker build -t $USER/achat_back ${springF}/"

                sh "docker build -t $USER/achat_front ${angularF}/"
            }
         }


          stage("push back/front images"){

        steps{
           
            echo "====++++executing build and push back + front images++++===="

            sh "docker login -u $DOCKERHUB_CREDENTIALS_USR -p $DOCKERHUB_CREDENTIALS_PSW"

            sh "docker push $USER/achat_back"

            sh "docker push $USER/achat_front"

            sh "docker logout"
                       
        }
           
        post{
       
            success{
                echo "====++++push image execution failed++++===="
            }
        
            failure{
                echo "====++++push image execution failed++++===="
             }
    
            }
       } 



  }
}


