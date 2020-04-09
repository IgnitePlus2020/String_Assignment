package com.tgt.igniteplus;
import java.util.*;
public class CompStrings {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the 1st string to be compared:");
       String a = sc.nextLine();
       System.out.println("Enter the 2nd string to be compared:");
       String b = sc.nextLine();
       System.out.println("On comparing "+a+" and "+b+" : " +a.equals(b));

    }
}
