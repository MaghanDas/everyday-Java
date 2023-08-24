import java.util.Arrays;

 public class arrays {

    public static void swap(int array[], int i, int j) {

        int temp;

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            // swap function to swap values
            swap(arr, start, end);
            start++;
            end--;
        }
        // printing the reverse elements now
        for (int i : arr) {                
            System.out.print(i + " ");
        }
    }
}
