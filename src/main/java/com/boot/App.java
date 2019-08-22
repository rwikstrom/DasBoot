package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

// This annotation scans our project for spring components and auto-wires up most of Spring
// libraries we wanna use by enabling auto-configuration.
@SpringBootApplication
public class App 
{
    // Starts Java and then the application. The JVM initializes and passes control execution to this method.
    public static void main( String[] args )
    {
        //
        SpringApplication.run(App.class, args);
    }
}
