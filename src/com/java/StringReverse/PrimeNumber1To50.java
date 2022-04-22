package com.java.StringReverse;
public class PrimeNumber1To50 {
    public static void main(String[] args) {
        System.out.println("prime numbers are: ");
        int num = 50, count;
        for (int a = 1; a <= num; a++) {
            count = 0;
            for (int b = 2; b <= a / 2; b++) {
                if (a % b == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(a);
            }
        }
    }
}


