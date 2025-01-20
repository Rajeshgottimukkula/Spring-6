package org.example.main;

import org.example.beans.Mobiles;
import org.example.beans.Students;
import org.example.beans.Vehicle;
import org.example.config.MobileConfig;
import org.example.config.ProjectConfig;
import org.example.config.VehicleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Xuv700");
//        System.out.println(vehicle.getName()+" from non spring context");
//
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);
//
//        Vehicle vehicle1=context.getBean(Vehicle.class);
//
//        System.out.println(vehicle1.getName()+" from spring context");
//
//
//
//        // Example of solving NoSuchBean exception
//        Vehicle vehicle2=context.getBean("vehicle2",Vehicle.class);
//
//        System.out.println(vehicle2.getName()+" from spring context");
//
//
//        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MobileConfig.class);
//
//        Mobiles redmi=context1.getBean("redmi", Mobiles.class);
//
//        System.out.println(redmi.getName()+" from spring context");

        ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Students students=context.getBean(Students.class);
students.methodFromComponentClass();
Vehicle tesla=context.getBean("tesla",Vehicle.class);

        System.out.println(tesla.getName());
        System.out.println(students.getName());

    }
}