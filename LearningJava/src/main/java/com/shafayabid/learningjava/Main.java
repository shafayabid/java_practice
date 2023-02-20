package com.shafayabid.learningjava;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //datatypes
        int hello_world = 5;
        double num2 = 5.0;
        boolean b = true;
        char c = 't';
        char d = '4';
        String str = "this is a string";

        //add underscores to bigger numbers for better readability
        int numWithUnderscores = 1_000_000_008;

        //print statements
        System.out.println("Hello World");
        System.out.println(hello_world);

        //basic operators
        int x = 5;
        int y = 7;
        int z = 15;
        int sum = x + y + z;
        int difference = x - y - z;
        int multiply = x * y * z;
        int divide = z / y;
        double divide1 = z / y;

        double a = 7;
        double b1 = 15;
        double divide2 = b1 / a;

        double d1 = Math.pow(x,y);

        double divideTypeCasting = z / (double)y;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(divide1);
        System.out.println(divide2);
        System.out.println(divideTypeCasting);
        System.out.println(d1);

        //initializing new scanner
        Scanner sc = new Scanner(System.in);

        //String input
        System.out.println("Enter Integer:");
        String scanned = sc.next();
        System.out.println(scanned);
        //converting input to a different datatype
        int abc = Integer.parseInt(scanned);

        //integer input
        System.out.println("Enter Integer:");
        int scannedInt = sc.nextInt();
        System.out.println(scannedInt);

        //other inputs
        System.out.println("Enter Double:");
        double scannedDouble = sc.nextDouble();
        System.out.println("Enter Boolean:");
        boolean scannedBoolean = sc.nextBoolean();
        System.out.println("---------------------------------");


        //Conditions and Booleans
        int l = 34;
        int m = 65;
        int n = 23;

        boolean compare = !(l > m || n < m);
        System.out.println(compare);

        //increment and decrement numbers
        int number = 0;
        //return the value and then increment by 1
        System.out.println(number++);
        System.out.println(number);
        //increment by 1 and then return the value
        System.out.println(++number); //the same goes for decrement operators

        //shorthand assignment operators
        int numberOne = 23;
        numberOne += 2;
        numberOne *= 2;
        numberOne /= 2;
        numberOne %= 2;

        //strings
        String string = "shafay learns java";
        System.out.println(string.toUpperCase());
        System.out.println(string.substring(14));
        System.out.println("    ".isEmpty()); //false
        System.out.println("    ".isBlank()); //true

    }
}
