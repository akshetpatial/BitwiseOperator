package com.akshet.math;

import java.util.Scanner;

public class SquareRoot {

    public static void Sqrt(int num){
        System.out.println("This will give answer only when Perfect Square root is provided");
        int count=0;
        // As we know obviously the Square Root is less then half of the number so we iterator to half only
//        for(int i=1;i<num;i++){
        for(int i=1;i<=(num+1)/2;i++){
            count++;
            if(i*i==num) {
                System.out.println("The Square Root of " + num + " is: " + i);
                System.out.println("We get answer after "+count+ " iterations!");
            }
        }
    }

    public static void Sqrt_Opt(int num){
        int start=0;
        int end =num;
        int count=0;
        int flag=0;
        while(start<=end) {
            count++;
                int mid = start + (end - start) / 2;
                // Mind this approach doesn't work for big numbers as mid*mid will be out of the limit so this will break at that
                // moment.
                if (mid * mid == num) {
                    flag++;
                    System.out.println("The Square Root of " + num + " is: " + mid);
                    System.out.println("We get answer after "+count+ " iterations!");
                    break;
                } else if (mid * mid > num)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            if(flag==0) {
                double root = 0.0;
                int check=0;
                for (int i = 0; i <= 0.001; i++) {
                    while (root * root <= num) {
                        root += 0.001;
                        check++;
                    }
                    root -= 0.001;
                }
                System.out.printf("%.3f\n",root);
                System.out.println("We get answer after "+check+ " iterations!");

                System.out.println("Square root using in-built method: ");
                System.out.printf("%.3f\n",Math.sqrt(num));
                }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number you want to find the Square Root of(should be a perfect Square): ");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();

        System.out.println("Brute Force: ");
        Sqrt(num);

        System.out.println("Optimize Approach");
        Sqrt_Opt(num);
    }
}
