package com.syntax.class27;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numberList=new ArrayList<>();
        Double double1=new Double(10.5);
        double number=double1.doubleValue(); // unboxing
        Double number2=new Double(number); // boxing

        double number3=10.5;
        Double number4=number3; // autoboxing
        number3=number4; //autoUnboxing

        String name=new String("Hakan");
        String name3="Hakan";

    }
}
