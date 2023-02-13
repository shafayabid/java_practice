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
}