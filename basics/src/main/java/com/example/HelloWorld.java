package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*make sure to have the javax.annotation dependency*/


public class HelloWorld  {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + person.getFullName() );
    }
    @PostConstruct
    public void init() throws Exception{
        System.out.println(
                "the init() method"
                        + "  Using Annotation");

    }
    @PreDestroy
    public void destroy() throws Exception{
        System.out.println(
                "the destroy() method"+"  Using Annotation");

    }


}
