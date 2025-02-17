
public class Problems {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 2, 3, 4, 4, 4, 6, 6, 10 };
    int lengthOfremoved = removeElement(arr, 4);
    int[] removed = removedArray(arr, 4);

    System.out.println(removed.length);
    for (int iterable_element : removed) {
      System.out.println(iterable_element);
    }
    // System.out.println(lengthOfremoved);
  }

  public static int removeElement(int[] nums, int val) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }

  public static int[] removedArray(int[] nums, int val) {
    int[] j = new int[nums.length];
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        j[k] = nums[i];
        k++;
      }
    }

    int[] result = new int[k];
    for(int i = 0; i < k; i++){
     result[i] = j[i]; 
    }
    return result;
  }
}

// some problems in arrays are in linear search and binary search directory and also do checkout some sorting algorithms in sorting directory.