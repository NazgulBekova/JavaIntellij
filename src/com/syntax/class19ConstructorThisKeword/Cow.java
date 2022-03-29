package com.syntax.class19ConstructorThisKeword;

public class Cow {
    static int normalNumberOfLegs=4;
    /*
    * when we don't assign values to the instance fields java assigns default
    * values to these fields
    * int=0;
    * double=0.0;
    * class objects with null;
    * boolen with=false
    * chars\u0000;
    * */
    private String name;
    int age;
    double weight;
    String breed;
    char gender;
    //the constructor that is provided automatically when we don't create any constructors in a class is called
    //default constructors

    //below is zero/no argument constructor

    Cow(){
        // you might want to execute some code to set up the resources for
        //your class like opening the connections to database checking it internet
        //is available or not etc
    }
    void printName(){
        System.out.println(true);
    }


}
