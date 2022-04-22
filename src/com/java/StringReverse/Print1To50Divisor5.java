package com.java.StringReverse;

public class Print1To50Divisor5 {
    public static void main(String[] args) {
        System.out.println("number divisor by 5 are");
        for( int a = 1; a <= 50; a++ ){
            if( a % 5 == 0){
                System.out.println(a);
            }
        }
    }
}
