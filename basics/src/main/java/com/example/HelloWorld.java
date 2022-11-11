package com.example;





public class HelloWorld  {

    private Person person;

    public HelloWorld(Person person) {
        this.person = person;
    }
    /*
    * creating Bean using the Constructor methode
    * */
     public void test(){
         person.name();
        System.out.println("that is just for testing!!");
     }


}
