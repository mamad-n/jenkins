job('job1') {
    scm {
        git {
            branch ('main')
            remote {
                url ('https://github.com/mamad-n/jenkins.git')
            }
        }
    }
    triggers {
        scm('*/5 * * * *')
    }
    steps {
        shell("echo from job created with jobe dsl")
    }
}
