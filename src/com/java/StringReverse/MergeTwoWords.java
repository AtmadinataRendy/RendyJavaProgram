package com.java.StringReverse;
import java.util.*;
public class MergeTwoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 words with each only 3 letter: ");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println("Merging words: " + word1 + ", " + word2);
        new MergeTwoWords().printMerge(word1,word2);
        System.out.println(printMerge(word1, word2));


    }

    static String printMerge(String word1, String word2) {
        String mergeString="";
        if(word1.length() > 3 || word2.length()>3){
            System.out.println("Invalid Input");
        }else{
            for(int i=0; i<word2.length(); i++){
                mergeString = mergeString + word1.charAt(i) + word2.charAt(i);
            }
        }
        return mergeString;
    }
}

