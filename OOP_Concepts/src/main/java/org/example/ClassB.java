package org.example;

public class ClassB extends ClassA {
    public ClassB(){
        super(5); //calls parameterized constructor of class A
        System.out.println("Default constructor of class B");
    }
    public ClassB(int b){
        this(); //calls default constructor of this class
        System.out.println("Parameterized constructor of class B");
    }
}
