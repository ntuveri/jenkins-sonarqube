# Goal
The goal is to explore the integration among Spring applications, Jenkins and SonarQube.

## Gradle plugin
The Spring application uses the SonarScanner Gradle plugin to scan source code and publish scan results to SonarQube server.
Details at https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-gradle/ and https://plugins.gradle.org/plugin/org.sonarqube

## Jenkins plugin
The Jenkins pipeline uses the SonarScanner Jenkins plugin to centralize the configuration of SonarQube server connection details in Jenkins global configuration. 
Details at https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-jenkins/ and https://plugins.jenkins.io/sonar/

## Setup SonarQube server
Configure the host running the SonarQube Docker image with `sysctl -w vm.max_map_count=262144` (only last the current session) or by adding the setting to `/etc/sysctl.conf` configuration file (permanent). 


## Setup Jenkins 