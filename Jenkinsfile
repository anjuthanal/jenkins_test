pipeline () {
  agent any
   stages{
     stage(‘BuildApplication’){
		sh './gradlew clean assembleDebug --stacktrace'
     }
     stage(‘Test’){
		echo ‘Runnig test..’
     }
	
 }
}