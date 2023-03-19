package com.daniyal;
public class Product {
    String name;
    int price;

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public void show(){
        System.out.println("Thank you for buying a "+this.name+"!");
        System.out.println("Your total price is INR "+this.price);
    }
}
