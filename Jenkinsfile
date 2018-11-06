pipeline () {
  agent any
   stages{
     stage(‘BuildApplication’){
      steps{
		sh './gradlew clean assembleDebug --stacktrace'
      }	
    } 
   stage(’Testing’) {
	steps{
		echo ‘Testing application….’
        }
    } 
stage(’UserApproval’) {
	steps{
		input ‘Ok?’
        }
    } 
  stage(’UploadToHockey’) {
	steps{
		hockeyApp applications: [[apiToken: '2b86281293dd4b14935296a5cd1e4188', downloadAllowed: false, filePath: 'app/build/outputs/apk/debug/app-debug.apk', mandatory: false, notifyTeam: false, releaseNotesMethod: none(), uploadMethod: appCreation(false)]], debugMode: false, failGracefully: false
        }
    } 	
 }
}