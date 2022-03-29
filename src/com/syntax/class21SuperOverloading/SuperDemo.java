package com.syntax.class21SuperOverloading;

public class SuperDemo {

}
class AAA{

}
class BBB extends AAA{
    String name;

    BBB() {
    }

    BBB(String name){
        super();
        //this(); we can't use this() and super() inside the same constructor

        this.name=name;
    }
}
