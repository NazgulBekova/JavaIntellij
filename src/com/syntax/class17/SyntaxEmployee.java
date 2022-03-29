package com.syntax.class17;

public class SyntaxEmployee {
    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselObject=new SyntaxEmployee();
        aselObject.empId="123";
        aselObject.salary=200000;
        System.out.println(aselObject.empId);
        System.out.println(aselObject.salary);
        System.out.println(SyntaxEmployee.CEO); // good practice
        //System.out.println(aselObject.CEO); // bad practice

        SyntaxEmployee moazzamObj=new SyntaxEmployee();
        moazzamObj.empId="456";
        moazzamObj.salary=198000;
        System.out.println(moazzamObj.empId);
        System.out.println(moazzamObj.salary);
        System.out.println(SyntaxEmployee.CEO);

    }

}
