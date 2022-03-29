package com.syntax.class24Abstract;

public class Task1Tester {
    public static void main(String[] args) {

        //in java we can store the object of a child classes
        //in a parent type variable
        //every class in java can be treated as data type
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();

        // as we can store the object of a child in a parent class
        //we can also create an array of these students as shown below

        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudents()};
    /* int[] arr={1,2,3};
    for (int number:arr){
    System.out.println(number);
    }
     */ //students[0].practice();
        for (Student student : students){
            //calling the methods from all the children classes
            student.study();
            student.doHomeWork();
            student.practice();

        }
    }
}