start()

def start() {
  node {
    stage ('Clean & Git checkout') {
      echo 'Clean & Git checkout Stage Started'

      deleteDir()
      checkout(scm)
    }

    stage ('Run unit tests') {
      echo 'Run unit tests Stage Started'

      sh "./gradlew app:testDebugUnitTest"
    }

  }
}