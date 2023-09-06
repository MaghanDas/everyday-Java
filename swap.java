public class swap{
    public static void main(String[] args) {
        int[] values = {5, 10};

        System.out.println("Before swapping:");
        System.out.println("a = " + values[0]);
        System.out.println("b = " + values[1]);

        swap(values);

        System.out.println("After swapping:");
        System.out.println("a = " + values[0]);
        System.out.println("b = " + values[1]);
    }

    public static void swap(int[] arr) {
        if (arr.length == 2) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }
}
