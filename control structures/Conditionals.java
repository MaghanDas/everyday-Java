import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        
        // if - else 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible to vote");
        }
        else
        System.out.println("you can't vote");
    }
}