pipeline () {
  agent any
   stages{
     stage(‘BuildApplication’){
      steps{
		sh './gradlew clean assembleDebug --stacktrace'
      }	
    } 
   
 }
}