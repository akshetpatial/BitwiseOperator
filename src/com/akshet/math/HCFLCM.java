package com.akshet.math;

import java.util.Scanner;

public class HCFLCM {

    // highest common factor we can use this to solve the linear equations
    // We are finding the HCF using Recursion
    public static int HCF(int num_1, int num_2){
        if(num_1==0)
            return num_2;
        return HCF(num_2%num_1,num_1);
    }

    // Least common multiple
    // We know that num_1 * num_2 = LCM * HCF
    // Product of the two numbers is equal to product pf their LCM and HCF
    public static int LCM(int num_1, int num_2){
        int lcm = (num_1 * num_2)/HCF(num_1,num_2);
        return lcm;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner scan = new Scanner(System.in);
        int num_1= scan.nextInt();

        System.out.println("Enter the Second number: ");
        int num_2= scan.nextInt();

        System.out.println("HCF of two numbers: ");
        int hcf=HCF(num_1,num_2);
        System.out.println("The HCF/GCD of given two numbers is: "+hcf);

        System.out.println("LCM of two numbers: ");
        int lcm= LCM(num_1,num_2);
        System.out.println("The LCM of given two numbers is: "+lcm);
    }
}
