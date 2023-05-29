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
        System.out.println("---------");

        JaggedArray ja = new JaggedArray();
        int nums2[][] = new int[4][];
        nums2 = ja.fillArray(nums2);
        ja.printUsingForEach(nums2);
        System.out.println("---------");

        Strings str = new Strings();
        StringBuffer name = new StringBuffer("Shafay");
        str.appendString(name);
        str.insertString(name);
        System.out.println("---------");

        Mobile mob = new Mobile();
        mob.brand = "Samsung";
        mob.price = 200;

        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        mob1.price = 300;

        mob.show();
        mob1.show();
        Mobile.showStatic(mob);
        System.out.println("---------");

        Human hum = new Human();
        hum.setAge(24);
        hum.setName("Shafay");
        System.out.println(hum.getName() + " : " + hum.getAge());
        System.out.println("---------");

        ClassB bclass = new ClassB(5);
        System.out.println("---------");

        new ClassA().show(); //creating anonymous object
        System.out.println("---------");

        AdvCalc calc = new AdvCalc();
        int v1 = calc.add(1,2);
        int v2 = calc.sub(3,2);
        System.out.println(v1 + " " + v2);
        System.out.println("---------");

        ClassA objA = new ClassB();
        ClassB objB = (ClassB) objA;
        System.out.println("---------");

        Suzuki alto = new Suzuki();
        alto.playMusc();
        alto.drive();
        System.out.println("---------");

        ClassA.inA objInnerClass = new ClassA.inA();
        ClassA anonObj = new ClassA(){
            public void show(){

                System.out.println("anonymous object in new A created");
            }
        };
        anonObj.show();
        System.out.println("---------");
    }
}
