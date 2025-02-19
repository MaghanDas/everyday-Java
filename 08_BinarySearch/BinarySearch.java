
public class BinarySearch {

  public static void main(String[] args) {

    // Binary Search Algorithms!
    // 1. Find Middle element.
    // 2. Compare Middle element with target.
    // 3. If target is greater than middle element, search in right half.
    // 4. If target is less than middle element, search in left half.
    // 5. Repeat steps 2-4 until target is found or not found.

    // time complexity: O(log n)
    // space complexity: O(1)
    // total comparison in the worst case is log n.

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    
    int target = 8;
    // return index of target if found, else return -1.
    System.out.println(binarySearch(arr, target));
  }

  public static int binarySearch(int[] arr, int target) {

    int start = 0;
    int end = arr.length - 1;
    // middle = (start + end) /2 -> for large integers in java it may exceeds the
    // range of int.

    while (start <= end) {

      int middle = start + (end - start) / 2;
      if (target < arr[middle]) {
        end = middle - 1;
      } else if (target > arr[middle]) {
        start = middle + 1;
      } else {
        return mid;
      }

    }
    return -1;
  }

  
}