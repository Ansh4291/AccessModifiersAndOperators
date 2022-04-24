package com.bridgelabz;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int no = sc.nextInt();
        int temp = no;
        int rev = 0 , rem = 0;

        while( temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (no == rev) {
            System.out.println("Your Number is palindrome : " + no);
        }
        else {
            System.out.println("Your number is not a Palindrome : " + no);
        }
    }

}
