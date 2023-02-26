package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int var = cal.add(1,2);
        System.out.println(var);
        var = cal.add(1,2,3);
        System.out.println(var);
        System.out.println("---------");

        MDArray arr = new MDArray();
        int nums[][] = new int[5][5];
        arr.fillArray(nums);
        arr.printArray(nums);
        System.out.println();
        arr.printUsingForEach(nums);
    }
}
