package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class HelloWorld implements InitializingBean, DisposableBean {

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
    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println(
                "the init() method"
                        + " Programmatic Approach");

    }
    @Override
    public void destroy() throws Exception{
        System.out.println(
                "the destroy() method"+ " Programmatic Approach");

    }


}
