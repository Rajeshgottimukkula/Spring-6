package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
Vehicle vehicle = new Vehicle();
vehicle.setName("Tesla");

        return vehicle;
    }


}