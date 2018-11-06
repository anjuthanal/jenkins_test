pipeline () {
  agent any
   stages{
     stage(‘BuildApplication’){
      steps{
		sh './gradlew clean assembleDebug --stacktrace'
      }	
    } 
   stage(‘Test’){
	steps {
         // One or more steps need to be included within the steps block.
      }
      input {
         message 'Want to proceed?'
      }
    } 
 }
}