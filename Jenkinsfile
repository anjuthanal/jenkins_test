pipeline () {
  agent any
   stages{
     stage(‘BuildApplication’){
      steps{
		sh './gradlew clean assembleDebug --stacktrace'
      }	
    } 
   stage(‘Test’){
      input {
         message 'Want to proceed?'
      }
    } 
 }
}