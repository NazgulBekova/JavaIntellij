package com.syntax.class23MethodOverriding;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        Suzuki suzuki=new Suzuki();
        suzuki.park();
        suzuki.start();
        System.out.println("**************Polimorphism examles***************");
        Car car=new BMW();
        car=new Tesla();
        car.start();
        //BMW bmw=new Car(); // we can't use
    }
}
