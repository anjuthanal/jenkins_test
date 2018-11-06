pipeline () {
  agent any
   stages{
     stage(‘BuildApplication’){
      steps{
		sh './gradlew clean assembleDebug --stacktrace'
      }	
    } 
   stage(‘Test’){
      steps{
		input(‘Do you want to proceed?’)
      }	
    } 
 }
}