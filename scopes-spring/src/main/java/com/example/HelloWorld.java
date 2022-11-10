package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

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
}
