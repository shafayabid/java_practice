package com.shafayabid.learningjava;

public class Person {

    private Name personName;

    //the static variable is global
    //it is global across all instances of the class
    //the test will fail if personCounter is not static
    private static int personCounter = 0;

    public Person(Name personName){
        this.personName = personName;
    }

    public Person(){
        personCounter++;
    }
    public String helloWorld(){
        return "Hello World";
    }

    public String hello(String name){
        return "Hello " + name;
    }

    public static int numberofPersons(){
        return personCounter;
    }

}
