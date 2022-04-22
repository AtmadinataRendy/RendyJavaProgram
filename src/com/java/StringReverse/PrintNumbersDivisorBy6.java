package com.java.StringReverse;

public class PrintNumbersDivisorBy6 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("numbers with divisible by 6 are: ");
        System.out.println("==============================");
        for (int a = 1; a <= 50; a++) {
            if (a % 6 == 0) {
                System.out.println(a);
            }
        }

    }
}

