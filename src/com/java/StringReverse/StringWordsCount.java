package com.java.StringReverse;

import java.util.Scanner;

public class StringWordsCount {
    public static void main(String[] args) {
        System.out.println("Enter statement");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int word = 1;

        for(int a =0 ; a < str.length(); a++){
            if(str.charAt(a) == ' '){
                word++;
            }

        }
        System.out.println(word);


    }
}


