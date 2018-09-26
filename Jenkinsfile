start()

def start() {
  node {
    stage ('Clean & Git checkout') {
      echo '....................Clean & Git checkout Stage Started....................'

      deleteDir()
      checkout(scm)
    }

    stage ('Run unit tests') {
      echo '....................Run unit tests Stage Started....................'

      sh "./gradlew app:testDebugUnitTest"
      sh "./gradlew app:jacocoTestReport"
    }


    stage('Generate build report') {
        echo '....................Generate build report Stage Started....................'


          sh "curl https://raw.githubusercontent.com/elgendyLanes/BuildReports/master/build-report.sh -o build-report.sh"
          sh "sh build-report.sh"

          $subject = 'Build report'
          $body = readFile 'report/build-report.html'
          $to = ('mohamed.elgendy011@gmail.com')
          emailext attachLog: false, body: $body, subject: $subject, to: $to, mimeType: 'text/html'
        }

  }
}