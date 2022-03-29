package com.syntax.class20Inheritance;

public class Task3 {
    /*
    **/
   private Task3(){
       System.out.println("private");
    }
    Task3(double a){
        System.out.println("Default");
    }
    protected Task3(String a){
        System.out.println("protected");
    }
     public Task3(boolean a){
         System.out.println("public");
     }

    public static void main(String[] args) {
        new Task3();
        new Task3("Haha");
        new Task3(10.2);
        new Task3(false);
    }
}
