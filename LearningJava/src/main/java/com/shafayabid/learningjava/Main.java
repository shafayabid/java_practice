package com.shafayabid.learningjava;
import java.awt.*;
import java.util.Arrays;
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
        System.out.print("Enter Integer:");
        String scanned = sc.next();
        System.out.println(scanned);
        //converting input to a different datatype
        int abc = Integer.parseInt(scanned);

        //integer input
        System.out.print("Enter Integer:");
        int scannedInt = sc.nextInt();
        System.out.println(scannedInt);

        //other inputs
        System.out.print("Enter Double:");
        double scannedDouble = sc.nextDouble();
        System.out.print("Enter Boolean:");
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

        //point class
        Point pointA = new Point(23,10);
        System.out.println(pointA);

        //arrays
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 23;
        array[2] = 5;
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        int[] array2 = {1,2,35,6,8};
        int[] fillArray = new int[5];
        Arrays.fill(fillArray,2);

        //loops and arrays
        String[] names = {"shafay", "abid", "ali", "ibrahim", "hassan", "muhammad"};

        //printing strings array
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //conditional statements
        if(true){
            System.out.println("true");
        }else if(false){
            System.out.println(false);
        }else{
            System.out.println("neither");
        }

        //for each loop (arrays)
        for(String str1: names){
            System.out.println(str1);
        }

    }
}
