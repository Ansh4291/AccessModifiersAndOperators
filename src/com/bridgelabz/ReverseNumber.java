package com.bridgelabz;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 123 , reversed = 0;
        int number;
        System.out.println("Orignal num is :- " + num);

        while(num != 0) {
            number = num % 10;
            reversed = reversed * 10 + number;
            num = num / 10;

        }

        System.out.println("Reversed number is :- " + reversed);
    }

}
