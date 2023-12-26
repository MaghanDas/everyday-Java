package com.parkash.question$3b;

public class Thread2 implements Runnable{

    int[] arr;
    public Thread2(int[] arr){
        this.arr = arr;
    }
    @Override
    public void run() {
        float average;
        int sum = 0;
        int divider = arr.length/2;
      for(int i = 1; i < arr.length; i+=2){
          sum += arr[i];
      }
        average = (float)sum/divider;
        System.out.println("Average : "+average);
    }
}
