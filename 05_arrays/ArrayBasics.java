import java.util.Scanner;
import java.util.Arrays;

// following code covers basic concepts of arrays in java, input & output, memory management, heap vs stack , string array in java, array passing to // functions, reversing, searching, sorting on arrays, Arrays.toString() method

public class ArrayBasics {

  public static void main(String[] args) {

    // Arrays are used to store multiple values in a single variable
    // Arrays are used to store data of the same type
    // Arrays are created with a fixed size
    // Arrays are zero-indexed
    // Declaring an Array
    // int[] numbers = new int[5];
    // int[] numbers = {1, 2, 3, 4, 5};
    // int[] numbers = new int[] {1, 2, 3, 4, 5};

    // int[] arr; // decares an array, arr->reference variable, but does not create
    // it (getting defined in stack)
    // arr = new int[5]; // initiates the array (getting created in heap)
    // new int[5] -> creating the object in heap memory -> runtime (dynamic memory
    // allocation)

    // arr -> reference variable -> points to the object in heap memory -> heap
    // memory (dynamic memory allocation(memory allocation at run time))
    // notes: array objects are in heap memory,
    // heap objects are not continuos in memory
    // hence, array objects may not be continuous,

    // Array Elements' Memory Location Depends on Their Type:

    // Primitive type elements (int, double, char, etc.): Stored inside the array
    // object on the heap itself.
    // Reference type elements (String, Object, etc.): The references (pointers) are
    // stored inside the array object (heap), but the actual objects they point to
    // may be elsewhere in the heap.

    /// new keyword is used to create an object in heap memory

    int x = 10; // Stored in stack (primitive type)
    int[] arr3 = new int[5]; // 'arr' reference in stack, but array object in heap

    arr3[0] = 100; // Stored in heap (inside the array object)

    String str = "Hello"; // String is stored in the String pool (special heap area)

    Object obj = new Object(); // 'obj' reference in stack, actual object in heap

    // ✅ Arrays in Java are always allocated in the heap.
    // ✅ Primitive array elements (like int[]) live inside the heap.
    // ✅ Objects are in the heap, but their references are in the stack.
    // ✅ Heap memory is fragmented, while stack memory is contiguous.

    /*
     * int[] arr = new int[10];
     * System.out.println(arr.length);
     * System.out.println(sizeof(arr));
     * for (int index = 0; index < arr.length; index++) {
     * arr[index] = index;
     * }
     * 
     * for (int iterable_element : arr) {
     * System.out.println(iterable_element);
     * }
     * // System.out.println(arr[0]);
     * 
     */

    // input and output in array..
    Scanner input = new Scanner(System.in);

    /*
     * System.out.println("enter the size of array: ");
     * 
     * int size = input.nextInt();
     * int[] numbers = new int[size];
     * 
     * for (int i = 0; i < size; i++) {
     * numbers[i] = input.nextInt();
     * }
     * 
     * for (int i = 0; i < size; i++) {
     * System.out.print(numbers[i] + " ");
     * }
     * System.out.println();
     * 
     * // reversing an array.
     * 
     */

    /*
     * for (int i = 0; i < size / 2; i++) {
     * int temp = numbers[i];
     * numbers[i] = numbers[size - 1 - i];
     * numbers[size - 1 - i] = temp;
     * }
     * 
     * System.out.println("Reversed array is: ");
     * for (int i = 0; i < size; i++) {
     * System.out.print(numbers[i] + " ");
     * }
     * System.out.println();
     */

    // sorting an array..
    // ex: 5 4 3 1 2 -> 1 2 3 4 5
    /*
     * int temp;
     * for (int i = 0; i < size; i++) {
     * for (int j = i + 1; j < size; j++) {
     * if (numbers[i] > numbers[j]) {
     * temp = numbers[i];
     * numbers[i] = numbers[j];
     * numbers[j] = temp;
     * }
     * }
     * }
     */

    /*
     * for (int i = 0; i < size; i++) {
     * System.out.print(numbers[i] + " ");
     * }
     * System.out.println();
     */

    /*
     * two sum problem in java ..
     * 
     * public int[] twoSum(int[] nums, int target) {
     * 
     * for(int i = 0; i < nums.length; i++) {
     * for(int j = i+1; j < nums.length; j++){
     * if(nums[i]+nums[j] == target) {
     * return new int[]{i,j};
     * }
     * }
     * }
     * return null;
     * }
     */

    // strings array in java (array of objects))
    // by default Null is stored in every string array element

    // String[] strA = new String[5];
    // strA[0] = "Hello";
    // strA[1] = "World";
    // strA[2] = "Java";
    // strA[3] = "Programming";
    // strA[4] = "Language";

    // for (int i = 0; i < strA.length; i++){
    // System.out.println(strA[i]);
    // }

    // To string method in java
    // with permitives
    int[] arr = { 1, 2, 3, 4, 5 };

    System.out.println(arr.length);
    System.out.println(Arrays.toString(arr));

    // with objects..
    // String[] names = { "John", "Mary", "Bob", "Alice" };
    // System.out.println(Arrays.toString(names));/

    // functions passing.
    // when we pass the array to the function, the function will get the reference of the array,
    // arrays are mutable in java but strings are immutable in java.
    // hence, passing the array to the function will not create a copy of the array,

    // let's say we want to swap the first and last element of the array with the help of functions
    
    swapArra(arr);
    System.out.println(Arrays.toString(arr));

    
    input.close();

  }
  // function to swap the first and last element of the array..
  public static void swapArra(int[] arr){
    int temp = arr[0];
    arr[0] = arr[arr.length-1];
    arr[arr.length-1] = temp;
  }
}
