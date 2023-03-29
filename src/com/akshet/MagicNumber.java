package com.akshet;

import java.util.Scanner;

public class MagicNumber {

    public static int FindMagicNumber(int nth){
        int magic=0;


        return magic;
    }

    public static void main(String[] args) {
        System.out.println("Enter the position up to which you want to find the Magic Number: ");
        Scanner scan = new Scanner(System.in);
        int nth= scan.nextInt();

        int out = FindMagicNumber(nth);
        System.out.println("The "+nth+" th magic number is "+out);
    }

}
