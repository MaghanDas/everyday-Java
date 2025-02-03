// package com.parkash.question$1a;

import java.util.Random;

public class ArrayProblem {
    static void printArray(String[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[3000];
        String[] arr2 = new String[3000];
        String[][] arr2D = new String[1500][2];

        int j = 0;
        for(int i = 0; i < arr2D.length; i++){
           arr2D[i][0] = arr2[j];
           arr2D[i][1] = Integer.toString(arr1[j]);
           j+=2;
        }
       printArray(arr2D);
    }
}
