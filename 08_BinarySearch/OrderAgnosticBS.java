
public class OrderAgnosticBS {

  public static void main(String[] args) {

    // order agnostic Binary search
    // 1. if the array is sorted in ascending order, then start from the leftmost
    // element and search.
    // 2. if the array is sorted in descending order, then start from the rightmost
    // element and search.
    // 3. if the array is not sorted, then we cannot apply this algorithm.

    // if start < end -> increasing order
    // if start > end -> decreasing order

    // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] arr = { 11, 10, 9, 7, 5, 3, 2, 1, -1, -5 };

    int target = 7;
    System.out.println(orderAgnosticBS(arr, target));
  }
  
  static int orderAgnosticBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    // find wether the array is sorted in ascending or descending order
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return mid;
      }
      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1; 
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}