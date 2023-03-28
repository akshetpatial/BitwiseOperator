package com.akshet;

import java.util.Arrays;
import java.util.Scanner;

public class FindUnique {

    public static int FindUniqueEle(int[] array){

        int num=0;
        // This method only works when there re two duplicates only for each element
        for (int j : array) {
            num ^= j;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array= new int[size];
        for(int i=0;i<size;i++)
            array[i]=scan.nextInt();

        // 2 3 4 1 2 1 3 6 4
        System.out.println("Entered Array is: ");
        System.out.print("[ ");
        for(int element : array)
            System.out.print(element+" ");
        System.out.println("]");

        int find = FindUniqueEle(array);
        if(find==0)
            System.out.println("There is no unique element in the array");
        else
            System.out.println(find);
    }

}
