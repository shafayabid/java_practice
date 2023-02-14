package com.shafayabid.learningjava;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class PersonTest{
    @Test
    public void printHelloWorld(){
        Person shafay = new Person();
        //assert equal checks and compares two values
        //in this testcase, it is checking if the method
        //returns "Hello World" or not
        //if the method returns "Hello World", the test would pass
        //else the test would fail
        assertEquals("Hello World", shafay.helloWorld());
    }

    @Test
    public void printHelloName(){
        Person person = new Person();
        assertEquals("Hello Shafay", person.hello("Shafay"));
    }

    @Test
    public void numberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        assertEquals(3, Person.numberofPersons());
    }
}