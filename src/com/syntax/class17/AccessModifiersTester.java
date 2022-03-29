package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModifiersTester {
    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        /*
        cant access name because it has privare access
        cant access age because it has default access
        cant access weight because it has protected access
        can only access color because it has public access
        which can be accessed from anywhere inside the same project
        * */
        //System.out.println(am.name);
        //System.out.println(am.age);
        //System.out.println(am.weight);
        System.out.println(am.color);

    }
}
