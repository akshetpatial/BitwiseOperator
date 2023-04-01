package com.akshet.math;

import java.util.Scanner;

public class Primenumber {

    // Basic Approach
    // Time complexity is O(N * Sqrt(N)) because the loop is running N times for each number and Sqrt(N) times to find the
    // up to that number
    // Space Complexity is O(1) that is constant we are not taking extra spaces
    public static int Prime(int num){

        int start=2;
        int flag=0;
        while(start<=Math.sqrt(num)){
            if(num%start==0) {
                flag++;
                break;
            }
              start++;
        }
        if(flag==0)
            return num;

        return -1;
    }


    // Here the Space complexity is O(N) as we are taking one extra array to check the Prime
    // Time Complexity is O(N * log(logN)) this log(logN) comes from tailor series
    public static void Prime_Sieve(int num, boolean[] prime){

        for(int i=2;i*i<=num;i++){
            if(!prime[i]){
                // 2*i because we will make all multiple values to true
                for(int j= 2*i; j<=num;j+=i)
                    prime[j]=true;
            }
        }

        int count=0;
        for(int i=2 ;i<=num;i++){
            if(!prime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nA total of "+ count+ " times!");
    }

    public static void main(String[] args) {
        System.out.println("Enter the number up to which you want to find the Prime number: ");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();

        int count=0;
        for( int i=2; i<=num;i++)
        {
            if(Prime(i)!=-1) {
                System.out.print(Prime(i) + " ");
                count++;
            }
        }
        System.out.println("\nA total of "+ count+ " times!");

        System.out.println("Finding the Prime using Sieve of Eratosthenes");
        // By Default this will be False
        // do not use Boolean as Boolean is an object/reference type that wraps a boolean ( same as Integer and int)
        // Boolean values are true, false,null whereas boolean values are only true and false
        boolean[] prime = new boolean[num+1];
         Prime_Sieve(num,prime);
    }

}
