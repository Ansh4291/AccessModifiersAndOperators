package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vowel");

        char ch = sc.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " :-is vowel");
                break;
            default :
                System.out.println(ch + ":- is consonent");
        }

    }

}
