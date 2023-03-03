package com.develhope.dependencyinjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;


    public MyController(MyService myService) {
        System.out.println("MyController.MyController() has been called");
        this.myService = myService;
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController.getName() has been called");
        return myService.getName();
    }
}
