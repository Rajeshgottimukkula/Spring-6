package org.example.beans;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Students {

    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    public void initialize(){
        this.name="Rajesh";

    }



    public void methodFromComponentClass(){

        System.out.println("Method from component class");
    }


}
