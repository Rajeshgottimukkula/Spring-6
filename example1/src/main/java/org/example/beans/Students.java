package org.example.beans;


import org.springframework.stereotype.Component;

@Component
public class Students {

    private String name;

    public String getName() {
        return name;
    }



    public void methodFromComponentClass(){

        System.out.println("Method from component class");
    }


}
