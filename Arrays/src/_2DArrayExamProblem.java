
// question statement:
// assume you have two single dimensional arrays of size 3000(one containing some numeric data and 
// other containg some string data.) . now merge only even index data of these arrays in a two 
// dimensional array with capacity of 1500.

public class _2DArrayExamProblem {
    static void printArray(String[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int[] arr1 = new int[3000];
        String[] arr2 = new String[3000];
        String[][] arr2D = new String[1500][2];

         // merge even index data into the 2d array
        for(int i = 0, j = 0; i < arr2D.length; i++, j+=2){
           arr2D[i][0] = arr2[j];
           arr2D[i][1] = Integer.toString(arr1[j]);
        //    j+=2;
        }
       printArray(arr2D);
    }
}
