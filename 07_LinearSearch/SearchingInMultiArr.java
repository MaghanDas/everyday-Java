import java.util.Arrays;

public class SearchingInMultiArr {

  public static void main(String[] args) {

    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int target = 5;
    System.out.println(Arrays.toString(searchMulti(matrix, target)));

  }

  static int[] searchMulti(int[][] matrix, int target) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}