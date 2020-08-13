#!/usr/bin/env groovy

def label = "build-jnode-app-${UUID.randomUUID().toString()}"
def home = "/home/node-app"
def workspace = "${home}/workspace/build-node-app"
def workdir = "${workspace}/src/github.com/SylwiaBrant/simple-node-js-react-npm-app"

pipeline {
    agent {
        docker {
            image 'node:6-alpine' 
            args '-p 3000:3000' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'npm install' 
            }
        }
    }
}