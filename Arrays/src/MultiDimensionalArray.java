import java.util.Scanner;

public  class MultiDimensionalArray {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    // working with 2d arrays
    int[][] numbers = new int[3][3];

    // taking the input
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = in.nextInt();
            }
        }
// output
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
    }
  }
}