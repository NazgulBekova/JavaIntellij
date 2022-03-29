package com.syntax.class19ConstructorThisKeword;

public class Car {
    String name;
    String make;
    String color;
    String type;
    Car(String name, String make, String color, String type){
        /*
        if we have same local and instance variable java always
        prefer local variable if you want to instruct java to use
        instance variable we use the "this" keyword
        */

        this.name=name;
        this.make=make;
        this.color=color;
        this.type=type;
    }
    Car() {
    }
    void PrintCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }

    }

