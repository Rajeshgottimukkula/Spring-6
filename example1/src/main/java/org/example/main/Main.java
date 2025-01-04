package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Xuv700");
        System.out.println(vehicle.getName()+" from non spring context");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle2=context.getBean(Vehicle.class);

        System.out.println(vehicle2.getName()+" from spring context");


    }
}