package com.akshet;

import java.util.Scanner;

public class ithBit {

    public static int FindBit(int num, int bit){
         int ans=0;
         // Masking the Numbers by left shifting the number with bit position -1
        ans = (num & (1<<(bit-1)));
        // Here we are converting the number back to its position ny using right shift or else we will get 1000 equals to 8 instead
        // just showing 1.
        int final_answer= ans>>(bit-1);
        //System.out.println(final_answer);
        return final_answer;
    }

    public static int SetBit(int num, int bit){
        int ans=0;
        ans = (num | (1<<(bit-1)));
        return ans;
    }

    public static int ResetBit(int num, int bit){
        int ans=0;
        // Compliment the 0001000 something to 1110111 and performing and(&) operation
        ans = (num & ~((1<<(bit-1))));
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();

        System.out.println("Enter the Bit you want to find: ");
        int bit = scan.nextInt();

        int check = FindBit(num,bit);
            System.out.println("The bit "+bit+"th is "+check);

        System.out.println(" Set ith Bit: ");
        System.out.println("Enter the Bit you want to Set: ");
        int bit_1 = scan.nextInt();

        int check_1 = SetBit(num,bit_1);
        System.out.println("The "+bit_1+"th bit is set");
        System.out.println("The new number is: "+check_1);

        System.out.println(" Reset ith Bit: ");
        System.out.println("Enter the Bit you want to Reset: ");
        int bit_2 = scan.nextInt();

        int check_2 = ResetBit(num,bit_2);
        System.out.println("The "+bit_2+"th bit is set");
        System.out.println("The new number is: "+check_2);
    }
}
