package com.syntax.class24Abstract;

public  class Parent {
    final String name="Vladlen";
    final void method(){
        //name="Mr A", can reassign if a variable is final
        System.out.println("I am parent");
    }
    void method2(){

    }
}
class Child extends Parent{
   /* void method(){
        can't override because it is final method
        }
        */
}