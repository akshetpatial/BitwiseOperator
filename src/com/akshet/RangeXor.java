package com.akshet;

import java.util.Scanner;

public class RangeXor {

    public static int FindRangeXor(int start, int end){

        // First Approach, Will take time when number is High and give TLE ( Time Limit Exceed )
     /*   int ans=0;
        for(int i=start;i<=end;i++){
            ans^=i;
        }
        return ans;
     */

        // Second Approach, will take less time as time complexity is constant
        // Xor from range start to end
        return xor(end) ^ xor(start-1);

    }

    // Xor of 0, 0^1=1, 1^2=3, 1^2^3=0, 1^2^3^4=4, 1^2^3^4^5=1, 1^2^3^4^5^6=7,1^2^3^4^5^6^7=0, 1^2^3^4^5^6^7^8=8
    // This gives Xor of 0 to a
    public static int xor(int a ){
        if(a%4==0)
            return a;
        else if(a%4==1)
            return 1;
        else if(a%4==2)
            return a+1;
        else if(a%4==3)
            return 0;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number from where you want to find the XOR: ");
        Scanner scan = new Scanner(System.in);
        int start= scan.nextInt();

        System.out.println("Enter the number up to which you want to find the XOR: ");
       int end= scan.nextInt();

        int out = FindRangeXor(start, end);
        System.out.println("The XOR within the Range start: "+ start + " and end: "+end+" is "+out);
    }
}
