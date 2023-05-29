package org.example;

public class ClassA {
    public ClassA(){
        System.out.println("Default constructor of class A");
    }
    public ClassA(int a){
        System.out.println("Parameterized constructor of class A");
    }

    public void show(){

        System.out.println("anonymous object created");
    }

    static class inA{
        public inA(){
            System.out.println("inner class working");
        }
    }
}
