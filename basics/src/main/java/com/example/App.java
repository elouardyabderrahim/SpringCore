package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Hello world!
 *
 */
@Configuration
public class App {


        @Bean
        public Person personBean(){
            return new Person();
        }



       @Bean
        public HelloWorld helloWorldBean(){
           return new HelloWorld(personBean());

        }

    public static void main(String[] args) throws Exception{
            /*
            * App.class is the configuration Class
            * */

        ConfigurableApplicationContext cap= new AnnotationConfigApplicationContext(App.class);
        HelloWorld hello=cap.getBean("helloWorldBean", HelloWorld.class);
        hello.test();



        }
}