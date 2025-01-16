package org.example.config;


import org.example.beans.Mobiles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileConfig {


// example for creating the bean directly without any name and value param
    @Bean("samsung")
    public Mobiles samsung(){
    Mobiles mobiles=new Mobiles();

    mobiles.setName("samsung");
    return mobiles;

    }
    //example of creating a bean with name parameter
    @Bean(name="redmi")
    public Mobiles redmi(){

        Mobiles mobiles=new Mobiles();
        mobiles.setName("redmi");
        return mobiles;

    }


    @Bean(value="IPhone")
    public Mobiles IPhone(){

        Mobiles mobiles=new Mobiles();

        mobiles.setName("Iphone");
        return mobiles;



    }
}
