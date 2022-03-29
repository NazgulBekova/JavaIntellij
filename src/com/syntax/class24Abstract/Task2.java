package com.syntax.class24Abstract;
/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
implementation of open behaviour: Example: to open .java file we need notepad++ or
sublime text, to open .doc file we need Microsoft word to be installed etc
 */


abstract class File{

    abstract void open();

    void edit(){
        System.out.println("Editing a class");
    }
    void close(){
        System.out.println("Closing the file");
    }
}
class JavaFile extends File{
    void open(){
        System.out.println("Use intellij to open java files");
    }
    void refactor() {
        System.out.println("Renaming the code");
    }
}
class  WordFile extends File {
    @Override
    void open() {
        System.out.println("Use microsoft word to open this file");
    }
}
class PdfFile extends File {
    @Override
    void open() {
        System.out.println("Use Adobe reader to open the file");
    }
}
public class Task2 {
    public static void main(String[] args) {
        /*if a method is not present inside the parent class we can't call that method using polimorphism
         */
       /* Object[] files={new JavaFile(), new PdfFile(), new WordFile()};
        files[0].*/

        File[] files={new JavaFile(), new PdfFile(), new WordFile()};
        for(int i=0; i<files.length; i++) {
            files[i].open();
            files[i].edit();
            files[i].close();
        }
        /*int i=0;
        while(i<files.length) {
            files[i].open();
            files[i].edit();
            files[i].close();
        }*/

    }


}
