package com.bridgelabz;

import java.util.Scanner;

public class UnitDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int num = sc.nextInt();

        if( num == 1) {
            System.out.println("You Entered One  Unit");
        }
        else if(num == 10) {
            System.out.println("You Entered Ten unit");
        }
        else if(num == 100) {
            System.out.println("You Entered Hundred unit");
        }
        else if(num == 1000) {
            System.out.println("You Entered Thousand unit");
        }
        else if(num == 10000) {
            System.out.println("You Entered Ten Housand unit");
        }
        else {
            System.out.println("Enter Valid number unit");
        }

    }

}
