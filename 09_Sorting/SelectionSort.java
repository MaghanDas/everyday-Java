import java.util.Arrays;

public class SelectionSort {

  static void selection(int[] arr) {
    
    for(int i = 0; i < arr.length; i++){
      // find the maximum elemnent in the remaining array and swap it with the current element.
          int last = arr.length - i - 1;
          int maxIndex = getMax(arr,0,last);
          swap(arr, maxIndex,last);
    }
  }

  static int getMax(int[] arr, int start, int end){
    int max = start;
    for(int i = start; i <= end; i++){
        if(arr[max] < arr[i]){
          max = i;
        }
    }
    return max;
  }
  static void swap(int[] arr, int start, int last){
    int temp = arr[start];
    arr[start] = arr[last];
    arr[last] = temp;
  }

  public static void main(String[] args) {

    int[] arr = {5, 4, 3, 2, 1};
    selection(arr);
    System.out.println(Arrays.toString(arr));
  }
}
