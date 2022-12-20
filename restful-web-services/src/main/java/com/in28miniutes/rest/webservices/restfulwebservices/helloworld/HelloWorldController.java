package com.in28miniutes.rest.webservices.restfulwebservices.helloworld;


import com.in28miniutes.rest.webservices.restfulwebservices.user.User;
import com.in28miniutes.rest.webservices.restfulwebservices.user.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    UserDaoService service;

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World ");
    }

}
