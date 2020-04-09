package com.tgt.igniteplus;
import java.util.*;
public class DigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string :");
        String in = sc.nextLine();
        for (int i = 0; i < in.length(); i++) {
            Character c = in.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        if (count == in.length()) {
            System.out.println("The string consists of only digits");
        } else {
            System.out.println("The string does not consist of only digits");

        }
    }
}