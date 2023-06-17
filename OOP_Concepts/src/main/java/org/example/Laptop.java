package org.example;

public enum Laptop {
    Macbook(1000),
    Dell(2100),
    HP(3600),
    Lenovo(900);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
