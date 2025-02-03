package com.parkash.question$3b;

public class Thread1 implements Runnable{
    int[] arr;
    public Thread1(int[] arr){
        this.arr = arr;
    }
    @Override
    public void run() {
        int i = 0, j = arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
