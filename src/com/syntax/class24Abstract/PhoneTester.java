package com.syntax.class24Abstract;
import java.util.Scanner;
public class PhoneTester {
    public static void main(String[] args) {
        Phone samsung=new Samsung();
        samsung.makePhoneCall();
        samsung.displayPicture();
        Scanner scanner=new Scanner(System.in);
        scanner.nextInt();
        //Phone phone=new Phone(); abstract class can't create an object

    }

}
