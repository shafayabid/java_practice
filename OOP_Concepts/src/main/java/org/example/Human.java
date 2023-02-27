package org.example;

public class Human {
    private int age;
    private String name;

    //Default Constructor
    public Human(){
        age = 12;
        name = "Ali";
    }

    //Parameterized Constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    //getter methods
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    //setter methods
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}
