package com.akshet.math;

import java.util.Scanner;

public class HCFLCM {

    
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
