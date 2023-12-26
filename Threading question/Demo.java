package com.parkash.question$3b;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[50000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(1,50000);
        }

        Thread1 th1 = new Thread1(arr);
        Thread2 th2 = new Thread2(arr);

        Thread sum = new Thread(th1);
        Thread average = new Thread(th2);
        sum.start();
        average.start();

        try{
            sum.join();
            average.join();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
