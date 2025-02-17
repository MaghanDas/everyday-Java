

public class LinearSearchArray{
  public static void main (String[] args){

    // linear searching in array
    // linear search is a searching algorithm that searches for an element in a list one by one.
    // it is a sequential search algorithm.
    // the best case time complexity of linear search is O(1) and worst case time complexity is O(n).
    // the space complexity of linear search is O(1).

    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int target = 5;

    int ans = linearSearch(arr, target);
    System.out.println(ans);
  }

  static int linearSearch(int[] arr, int target){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == target){
        return i;
      }
    }
    return -1;
  }
  
}