start()

def start() {
    stage ('Clean & Git checkout') {
      echo 'Clean & Git checkout Stage Started'

      deleteDir()
      checkout(scm)
      sh 'git --no-pager log -1 --pretty=format:%ae HEAD > .committer'
      stash includes: '.committer', name: 'committer' // save committer in case we need to email a failure notice
    }

    stage ('Run unit tests') {
      echo 'Run unit tests Stage Started'

      sh "./gradlew sdk:test app:testDebugUnitTest"
    }
}