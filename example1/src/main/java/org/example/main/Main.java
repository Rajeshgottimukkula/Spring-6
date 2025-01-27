package org.example.main;

import org.example.beans.Mobiles;
import org.example.beans.MyBean;
import org.example.beans.Students;
import org.example.beans.Vehicle;
import org.example.config.MobileConfig;
import org.example.config.ProjectConfig;
import org.example.config.VehicleConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var xmlContext= new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(xmlContext.getBean("myBean", MyBean.class).getName());
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

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Students students=context.getBean(Students.class);
//students.methodFromComponentClass();
//Vehicle tesla=context.getBean("tesla",Vehicle.class);
//
//        System.out.println(tesla.getName());
//        System.out.println(students.getName());
//
//        context.close();
//        System.out.println(students.getName());


        Random random=new Random();
        int randomNumber=random.nextInt(10);
System.out.println(randomNumber);

        Supplier<Vehicle> audiSupplier=()->
        {

            Vehicle vehicle=new Vehicle();
            vehicle.setName("Audi");
            return vehicle;

        };


        Supplier<Vehicle> bmwSupplier=()->{


            Vehicle vehicle =new Vehicle();
            vehicle.setName("BMW");
            return vehicle;

        };

        if(randomNumber%2==0){

            context.registerBean("audi",Vehicle.class,audiSupplier);
        }else{

            context.registerBean("bmw",Vehicle.class,bmwSupplier);
        }
try{
       Vehicle vehicle= context.getBean("audi",Vehicle.class);
System.out.println(vehicle.getName());
    }catch(NoSuchBeanDefinitionException e){
    System.out.println("oh the random might be odd, thats why bean is not registered. there should definitely be a bmw bean");
    }
try {
    Vehicle vehicle = context.getBean("bmw", Vehicle.class);
    System.out.println(vehicle.getName());
} catch(NoSuchBeanDefinitionException e){
        System.out.println("oh the random might be even, thats why bean is not registered. there should definitely be a audi bean");
    }

}}