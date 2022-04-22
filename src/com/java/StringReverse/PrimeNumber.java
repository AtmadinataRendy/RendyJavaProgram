package com.java.StringReverse;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("enter numbers: ");
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int a = 1; a <= num; a++){
            if( num % a == 0){
                count++;

            }
        }
            if(count == 2){
                System.out.println(" is prime");
            }else{
                System.out.println(" is not prime");
            }
        
    }
}
