package com.techprimers.jenkinsDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/rest/jenkins")
public class JenkinsController {

    public  String helloJenkins(){

        return "Hello CICD via Jenkins";
    }
}
