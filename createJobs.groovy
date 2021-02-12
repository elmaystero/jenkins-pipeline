pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/elmaystero/theme-park-api.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
