package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int var = cal.add(1,2);
        System.out.println(var);
        var = cal.add(1,2,3);
        System.out.println(var);
    }
}
