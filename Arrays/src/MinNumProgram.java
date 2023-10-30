public class MinNumProgram {

  static int minNumber(int[] arr) {
    int min = arr[0];
    for (int i = 0; i< arr.length; i++) {
      if ( arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
  public static void main(String[] args) {

    int[] numbers = {10, 2, 3, 4, 5};
    int minimun = minNumber(numbers);
    System.out.println(minimun);
   }
  }
