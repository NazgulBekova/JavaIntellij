package com.syntax.class19ConstructorThisKeword;

public class PandaTester {
    public static void main(String[] args) {
        Panda panda=new Panda("Kunfu");
        panda.printInfo();
        Panda panda1=new Panda("MannysPanda", "Black Panda");
        panda1.printInfo();
    }
}
