package org.example.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PreDestroy
    public void destory(){
        System.out.println("Destroy method called");
    }


}
