package com.lsg.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("h2")
public class App
{
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}