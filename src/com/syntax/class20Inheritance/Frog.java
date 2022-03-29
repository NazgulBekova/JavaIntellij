package com.syntax.class20Inheritance;

public class Frog {
    String name;
    String  color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color=color;
        this.age=age;
       // double weight=10; java always prefers local variables not instance
        this.weight=10;
    }

    public Frog(String name, String color, int age, double weight) {
        //this() shold be the first line inside the constructor body
        this(name, color, age);

        this.weight=weight;
    }
    void printInfo(){
        //this() not allowed inside the methods
        //this (name, color, age);
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
