package com.develhope.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(String myComponentName){
        System.out.println("MyComponent.MyComponent() has been called");
        this.myComponentName = myComponentName;
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName has been called");
        return myComponentName;
    }

}
