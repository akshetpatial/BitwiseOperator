package com.akshet;
//https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;
import java.util.Scanner;

public class flippingImage {

    public static int[][] flipAndInvertImage(int[][] image) {
    
        int start_row=0;
        int end_row = image.length;
        int end_col= image[0].length;
        int[] rowElement = new int[image[0].length];
        int[][] flipped= new int[end_row][end_col];
        int cols=0;
        while(start_row<end_row){
            for(int col=0;col<image[start_row].length;col++)
                rowElement[col]=image[start_row][col];

            //Copying the Rows elements from reverseRowElements Array to flipped Array
           flipped[start_row] = reverseRowElements(rowElement);

            start_row++;
        }
        return flipped;
    }

    public static int[] reverseRowElements(int[] rowElement){

        int end_col=rowElement.length-1;
        int[] rowEle= new int[end_col+1];
        int start=0;
         while(end_col>=0){
            rowEle[start]=rowElement[end_col];
            // Invert the Bits here
             rowEle[start]= rowEle[start]==1?0:1;
             end_col--;
             start++;
        }
    return rowEle;
    }

    public static void main(String[] args) {

        System.out.println("Enter the no of Rows: ");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();

        System.out.println("Enter the no of Cols: ");
        int col = scan.nextInt();

        System.out.println("Enter the number of Elements: ");
        // 1 1 0 0 1 1 1 0 0
        int[][] image= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                image[i][j]=scan.nextInt();
            }
        }

        System.out.println("Entered 2D Array is: ");
        for(int[] element : image){
            System.out.println(Arrays.toString(element));
        }

        System.out.println("Flipped Image is: ");
        int[][] ans= flipAndInvertImage(image);
        for(int[] element : ans)
            System.out.println(Arrays.toString(element));

    }
}
