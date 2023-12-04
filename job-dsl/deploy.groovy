job('build-push-docker') {
    scm {
        git {
            branch ('main')
            remote {
                url ('https://github.com/mamad-n/jenkins.git')
            }
        }
    }
    triggers {
        scm('H/5 * * * *')
    }

    steps {
        dockerBuildAndPublish {
            repositoryName('my-app-jenkins')
            tag('6.5')
            dockerRegistryURL('http://localhost:5000/')
            registryCredentials('local-registry')
            forcePull(false)
            forceTag(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}
