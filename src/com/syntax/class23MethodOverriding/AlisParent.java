package com.syntax.class23MethodOverriding;

public class AlisParent {

    String girlName="Salma";
    double money=1000000;
    void marry(){
        System.out.println("Ali you should marry "+girlName);
    }
}
class Ali extends AlisParent{
    String girlName="Rihanna";

    void marry(){
        super.marry();
        System.out.println("But Dad I want to marry "+girlName);
    }
}
