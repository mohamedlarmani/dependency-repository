package com.develhope.dependencyinjection;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        System.out.println("MyService.MyService() has been called");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("MyService.getName() has been called");
        return myComponent.getMyComponentName();
    }
}
