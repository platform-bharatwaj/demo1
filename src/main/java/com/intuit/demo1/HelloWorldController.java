package com.intuit.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "You have successfully created Java Webservice DEMO1 using wizard. Awesome right!!!";
    }

}

