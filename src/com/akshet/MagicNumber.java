package com.akshet;

import java.util.Scanner;

public class MagicNumber {

    public static int FindMagicNumber(int nth){
        int magic=0;
        int count=1;
        int logBase2= (int) (Math.log(nth)/Math.log(2));
        int numberBits=logBase2+1;
        while(numberBits!=0){
            int LSB=nth&1;
            magic+=Math.pow(5,count)*LSB;
            nth=nth>>1;
            numberBits--;
            count++;
        }
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
