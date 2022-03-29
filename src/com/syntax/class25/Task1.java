package com.syntax.class25;

class Computer{
    String make;
    Computer(String make){
        this.make=make;
    }
    void login(){
        System.out.println("Use username and password to login");
    }
}
class Apple extends Computer{

    Apple(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("use fingerprint to login as well");
    }
}
class Lenovo extends Computer{

    Lenovo(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("use windows Hello as well to login");
    }
}
class HP extends Computer{

    HP(String make) {
        super(make);
    }
}

public class Task1 {
    public static void main(String[] args) {


        Lenovo lenovo = new Lenovo("Lenovo");
        lenovo.login();
        HP hp = new HP("HP");
        hp.login();
        Computer[] computers = {new Lenovo("Lenovo"), new HP("HP"), new Apple("Apple")};
        for (Computer c:computers){
            c.login();
        }
    }
}