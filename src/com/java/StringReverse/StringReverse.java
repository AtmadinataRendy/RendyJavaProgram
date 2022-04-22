package com.java.StringReverse;

import java.util.*;


public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hold = "";
        System.out.println("Please enter word to reverse");
        String str = sc.nextLine();
        for (int a = str.length() - 1; a >= 0; a--) {
            hold = hold + str.charAt(a);
        }
            System.out.println(hold);

    }
}
