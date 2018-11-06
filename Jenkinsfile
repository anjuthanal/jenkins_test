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
         echo 'Hello World'
      }
      input {
         message 'Want to proceed?'
      }
    } 
 }
}