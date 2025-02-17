import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArr {

  public static void main(String[] args) {

    int[][] nums = new int[3][3];
    
    // for (int index = 0; index < nums.length; index++) {
    // for(int k = 0; k < nums[index].length; k++){
    // nums[index][k] = index;
    // }
    // }

    // for (int index = 0; index < nums.length; index++){
    // for(int j =0; j < nums[index].length; j++){
    // System.out.print(nums[index][j] + " ");
    // }
    // System.out.println();
    // }

    // int[][] numbers = {{1, 2, 3},
    // {4, 5, 6}
    // };

    // for (int index = 0; index < nums.length; index++){
    // for(int j =0; j < nums[index].length; j++){
    // System.out.print(numbers[index][j] + " ");
    // }
    // System.out.println();
    // }

    // in multidimensiona array, every index itself is a array

    // column input isn't neccessaary
    // int[][] arr = { { 1, 2, 3 },
    // {5, 6 }
    // };

    // arr.length gives the number of rows. i.e(2)
    // arr[0].length gives the number of columns in the first row.

    // input
    Scanner input = new Scanner(System.in);
    int[][] arr2 = new int[3][3];

    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        arr2[i][j] = input.nextInt();
      }
    }

    // printing the output
    
    // for (int i = 0; i < arr2.length; i++) {
    //   for (int j = 0; j < arr2[i].length; j++) {
    //     System.out.print(arr2[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // another way Arrays.toString() method to prints in matric shape

    for(int row = 0; row < arr2.length; row++){
      System.out.println(Arrays.toString(arr2[row]));
    }
    // because arr2[row] is an array, so we can use Arrays.toString() method       to print it in matric shape.


    
  }
}