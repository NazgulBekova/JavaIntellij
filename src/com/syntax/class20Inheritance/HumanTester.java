package com.syntax.class20Inheritance;

public class HumanTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Zuhoor";
        System.out.println(student.name);
        student.printName();
        student.studentId="123";
        System.out.println("------------------------------");
        Principle principle=new Principle();
        principle.name="Gulden";
        principle.printName();
        principle.specialParkingSlot=false;
    }
}
