package org.example;

public class Mobile {
    String brand;
    int price;
    static String name;
    static int count = 0;
    static int countConstructor = 0;

    //static block is called only once when the first class obj is initialized
    static{
        name = "phone";
        count++;
    }

    public Mobile(){
        countConstructor++;
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
        System.out.println("static block: " + count);
        System.out.println("constructor: " + countConstructor);
    }

    //only static variables can be used within a static method
    public static void showStatic(Mobile obj){
        System.out.println("called with class not object");
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}
