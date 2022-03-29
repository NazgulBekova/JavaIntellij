package com.syntax.class21SuperOverloading;

public class SuperKeyWordIntro {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();

    }
}
class GrandParent{
    String color="Blue";
    void printInfo(){
        System.out.println("I am a grandpa");
    }
}
class Parent{
    String  color="Black";
    void printInfo(){
        System.out.println("I am Parent");
    }
}class Child extends Parent{
    void printInfo(){
        System.out.println("I am child");
        String color="Red";
    }
    void printColor(){

        String color="Green";
        //refers to local variable
        System.out.println(color);
        //refers to instance variable
        System.out.println(this.color);
        //refers to parent variable
        System.out.println(super.color);
    }
}
