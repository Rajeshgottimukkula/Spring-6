package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
@Configuration
public class VehicleConfig {

    @Bean
    Vehicle vehicle1(){
Vehicle vehicle = new Vehicle();
vehicle.setName("Vehicle1");

        return vehicle;

    }


    @Bean
    Vehicle vehicle2() {

        Vehicle v2 = new Vehicle();
        v2.setName("Vehicle 2");

        return v2;
    }


    @Bean
    @Primary
    Vehicle vehicle3(){


        Vehicle v3=new Vehicle();

        v3.setName("Vehicle3");
        return v3;
    }

    }







