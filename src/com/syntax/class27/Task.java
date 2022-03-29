package com.syntax.class27;

import java.util.ArrayList;

public class Task {
    //Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Arsen");
        names.add("Nazgul");
        names.add("Alman");
        names.add("Erden");
        names.add("Daniel");

        if(names.isEmpty()) {
            System.out.println("ArrayList is empty");
        }else {
            System.out.println("ArrayList is not empty");
        }
        if(names.contains("Daniel")) {
            System.out.println("Daniel is in the ArrayList");
        }else {
            System.out.println("Daniel is not in the ArrayList");
        }
        System.out.println(names.size());
        System.out.println(names);


    }
}
