pipeline {
    agent any
    stages {
        stage("compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("unit test") {
            steps {
                sh "./gradlew test"
            }
        }
        stage("Code Coverage") {
            steps {
                sh "./gradlew test jacocoTestCoverageVerification"
                sh "./gradlew test jacocoTestReport"
            }
        }
    }
}
