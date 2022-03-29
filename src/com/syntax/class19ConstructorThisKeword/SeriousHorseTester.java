package com.syntax.class19ConstructorThisKeword;

public class SeriousHorseTester {
    public static void main(String[] args) {
        Horse horse=new Horse("Jacky", 20,400);

        /*
        Horse -> Data type(Name of classes)
        horse-> Object/instance/reference variable/variable
        = --> assignment operator
        new --> keyword used to create object
        Horse ("Jacky", 20,400)-> call to a constructor
        ; --> line terminator in Java
        */

       horse.printHorseName();

    }
}
