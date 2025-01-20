package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.beans")
public class ProjectConfig {


    @Bean(name="tesla")
    public Vehicle vehicle1(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Tesla");
        return vehicle;
    }





}
