import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int x = sc.nextInt();
        System.out.println("enter 2nd number");
        int y = sc.nextInt();
        System.out.println("enter the operation you want to perfrom +, - , * , /");
        char opr = sc.next().charAt(0);
        switch (opr) {
            case '+':
                System.out.println("sum is " + (x + y));
                break;
            case '-':
                System.out.println("difference  is " + (x - y));
                break;
            case '*':
                System.out.println("mul is " + (x * y));
                break;
            case '/':
                System.out.println("div is " + (x / y));
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
