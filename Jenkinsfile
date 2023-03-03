node {
  stage("Clone the project") {
    git branch: 'master', url: 'https://github.com/utkarshsanju13/spring-azure-demo.git'
  }

  stage("Compilation") {
    bat "./mvnw clean install -DskipTests"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      bat "./mvnw test -Punit"
    } 
  }
  
  stage("Deployment") {
      bat './mvnw spring-boot:run -Dserver.port=8001'
    }
}