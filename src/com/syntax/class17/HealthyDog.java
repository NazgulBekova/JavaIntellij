package com.syntax.class17;

public class HealthyDog {
    //when the info is expected to be different from object to object
    // we store that info in an instance variable
    String name; //instance var
    String color; // instance var
    static int numberOfLegs; //static
    void eat() {
        int noOfTimes=3; // local
        System.out.println(name+" eats "+noOfTimes);
    }

    void sleep() {
       // System.out.println(name+" sleeping "+numberOfLegs); can access
    }
    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog(); // local

        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tomy";
        dog2.color="Navy blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();

    }
}
