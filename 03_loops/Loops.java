import java.awt.PrintJob;

public class Loops {

  public static void main(String[] args) {

    int i = 0;

    // for(int i = 0; i< 10; i++)

    // for(;i<10;){
    // System.out.println(i);
    // i++;
    // }

    // while(i<10){
    // System.out.println(i);
    // i++;
    // }

    // do{
    // System.out.println(i);
    // i++;
    // }while(i<10);

    boolean isTen = false;
    while (!isTen) {
      if (i == 10) {
        isTen = true;
      }
      System.out.println(i);
      i++;
    }

    // for each loop
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int num : nums) {
      System.out.println(num);
    }

    // printing the 2's table...
    for(int j = 1; j<=10; j++){
     System.out.println(j + " x " + " 2 " + " = " + j * 2); 
    }

    
  }
}