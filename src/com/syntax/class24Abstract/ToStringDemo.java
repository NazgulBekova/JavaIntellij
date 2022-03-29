package com.syntax.class24Abstract;

import java.lang.runtime.ObjectMethods;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo=new ToStringDemo("Mr A", 10);
        System.out.println(toStringDemo.toString());


    }
}
