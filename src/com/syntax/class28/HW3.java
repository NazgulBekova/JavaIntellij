package com.syntax.class28;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HW3 {
    //Create a Set of cities in which you want to make sure that insertion order
    // is maintained. Then remove any city that starts with “A”;
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Bishkek");
        cities.add("Almaty");
        cities.add("Tokio");
        cities.add("Seul");

        System.out.println(cities);




    }
}
