package com.syntax.class20Inheritance;

public class Task5 {
    String name;
    String address;

    public Task5(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo(){
        System.out.println(this.name+" "+this.address);
    }
}
