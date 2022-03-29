package com.syntax.class20Inheritance;

public class Task9 {
    /*
Write a Java program called Teacher.
Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
that would have it their own features and behaviour. Test all 4 classes
 */
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Teyfur";
        mathTeacher.teachCalculus();
    }
}
class TeacherA{
    String name;
    int age;
    double weight;
    void printName(){
        System.out.println(name);
    }
}
class MathTeacher extends TeacherA{
    boolean canTeachTrigonometry=true;
    void teachCalculus(){
        System.out.println(name+" teaching Calculus");

    }
}
class ChemistryTeacher{
    boolean canTeachChemicals=true;
    void teachOrganicChemistry(){
        System.out.println("Teaching Organic Chemistry");
    }
}
class PianoTeacher{
    boolean canRideBike=true;
    void teachPiano(){
        System.out.println("Teachinh Piano");
    }
}