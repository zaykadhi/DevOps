pipeline {

    environment {

     springF="achat_back"   
     angularF="achat_front"    
   }

          agent any

          stages{

            stage('Get project from GIT'){
                steps{
                    echo 'Pulling...';
                    git branch: 'main',
                    url : 'url github';
                }
            }



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



            stage('MVN SONARQUBE')
            {
                steps{
                sh 'cd ${springF} && mvn sonar:sonar -Dsonar.login=*** -Dsonar.password=***'
                }
            }



             stage("Nexus deploy"){
                steps{
                     script{
                        nexusArtifactUploader artifacts: [[artifactId: 'achat', classifier: '', file: 'achat_back/target/achat-1.0.jar', type: 'jar']], credentialsId: '***', groupId: 'tn.esprit.rh', nexusUrl: 'ip***:8081', nexusVersion: 'nexus3', protocol: 'http', repository: '***', version: '1.0'
                     }
                    }

                }




            stage("build and push back/front images"){
        steps{
            script {
            
            echo "====++++executing build and push back + front images++++===="
    
         withCredentials([usernamePassword(credentialsId: '***', passwordVariable: 'PASS', usernameVariable: 'USER')]){
         
                            sh "docker build -t $USER/achat_back ${springF}/"

                            sh "docker build -t $USER/achat_front ${angularF}/"

                            sh "echo $PASS | docker login -u $USER --password-stdin"

                            sh "docker push $USER/achat_back"

                            sh "docker push $USER/achat_front"
                        }
        }
        }
        post{

            always{
                sh "docker logout"
            }
        
            success{
                echo "====++++push image execution failed++++===="
            }
        
            failure{
                echo "====++++push image execution failed++++===="
            }
    
        }
    }




           stage('Deploy App'){

            steps {

            sh 'docker-compose -f docker-compose.yml up  -d'
             }

            post{
        
            success{
                echo "====++++Success++++===="
            }
        
            failure{
                echo "====++++Failed++++===="
            }
    
        }
                    

          }


    }
}
