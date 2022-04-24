package com.bridgelabz;

public class ReverseNumberFor {
    public static void main(String[] args) {
        int num = 123 , reversed = 0;

        System.out.println("Orignal number is :- " + num);

        for (;num != 0 ; num /= 10) {
            int number = num % 10;
            reversed = reversed * 10 + number;
        }

        System.out.println("Reversed Number is :- " + reversed);
    }
}
