package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception{

        ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("Beans.xml");


        cap.close();

        }
}