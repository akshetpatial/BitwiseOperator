package com.akshet;

import java.util.Scanner;

public class OddEven {

    private static Boolean CheckOddEven(int num) {
        // Program internally convert the num in Binary from decimal so we can use the BitWise Operators directly on them
        // So Below 1 will act as 0000...1 (last digit is one) and we are doing and Operation with the number
        //  On in other terms we can say it is the LSB Least Significant Bit
        return (num & 1) != 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter any number to find if it is odd or even: ");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();

        Boolean check = CheckOddEven(num);
        if(check)
            System.out.println("The number "+ num + " is odd.");
        else
            System.out.println("The number "+ num + " is even.");
    }

}
