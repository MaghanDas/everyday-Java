import java.util.Scanner;

public class Basics {
  public static void main(String[] args) {
    // System.out.println("Hellod!");
    // dataTypes
    int i = 23;
    float f = 23f;
    char c = 'a';
    String firstName = "Maghan";
    String lastname = "das";
    boolean isprogramer = true;
    /*
     * System.out.println(i);
     * System.out.println(f);
     * System.out.println(c);
     * // System.out.println(name);
     * System.out.println(!isprogramer);
     * 
     * System.out.println("name is " + firstName + lastname + " age is " + i +
     * " is programer " + isprogramer);
     * 
     * String greeting = "Hello Sir";
     * System.out.println(greeting); // Hello Sir
     * 
     * char a = 65; // ascii value of a
     * System.out.println(a + 32); // 97
     * System.out.println(a); // a
     * 
     * // taking input in java
     * /*
     * Scanner input = new Scanner(System.in);
     * System.out.println("Enter your name");
     * String name = input.nextLine();
     * float gpa = input.nextFloat();
     * int age = input.nextInt();
     * boolean ispass = input.nextBoolean();
     * char grade = input.next().charAt(0);
     * 
     * System.out.println("Name is " + name + " age is " + age + " grade is " +
     * grade + " gpa is " + gpa + " ispass " + ispass);
     * 
     */

    // simple calculator
    Scanner input = new Scanner(System.in);
    int firstNum;
    int secNum;
    char operator;
    char res;

    do {

      System.out.println("Enter first Number");
      firstNum = input.nextInt();
      System.out.println("Enter second Number");
      secNum = input.nextInt();
      System.out.println("Enter operator (+, - , * , /)");
      operator = input.next().charAt(0);

      switch (operator) {
        case '+':
          System.out.println("Addition is " + (firstNum + secNum));
          break;
        case '-':
          System.out.println("Subtraction is " + (firstNum - secNum));
          break;
        case '*':
          System.out.println("Multiplication is " + (firstNum * secNum));
          break;
        case '/':
          System.out.println("Devision is " + (firstNum / secNum));
          break;
        default:
          System.out.println("invalid operator");
      }
      System.out.println("DO YOU WANT TO CONTINUE (Y/N)");
      res = input.next().charAt(0);
    } while (res == 'Y' || res == 'y');
    System.out.println("THANKYOU USING MD CALCULATOR");
  }
}
