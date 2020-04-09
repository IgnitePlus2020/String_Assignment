package com.tgt.igniteplus;
import java.util.*;
public class EmptyString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String a = sc.nextLine();
        if(a.isEmpty())   // or if(a.length() == 0)
        {
            System.out.println("The entered string is empty");
        }
        else
        {
            System.out.println("The entered string is not empty");

        }

}
    }