package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
        System.out.println(courses);
        /*for (int i = 0; i < courses.size() ; i++) {
            if(courses.get(i).equals("Java")){
                courses.remove("Java");
            }// do not use loop when you changing size of array
        }*/
       /* for (String course:courses
             ) {
            if(course.equals("Java")){
                courses.remove(course);
            }
        }*/

    }
}
