public class MathOperations {

    // Method to calculate Fibonacci series up to the 'n' terms using a loop
    public static void fibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series (Up to " + n + " terms): ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }

    // Method to calculate factorial of a number 'n' using a loop
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("negative  number factorial doesnt exist.");
            return -1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        // Testing the 'fibonacci' method with different parameters
        System.out.println("Testing Fibonacci:");
        fibonacci(5); // Test with n = 5
        fibonacci(10); // Test with n = 10

        // Testing the 'factorial' method with different parameters
        System.out.println("\nTesting Factorial:");
        int num1 = 5;
        int num2 = 7;

        long factorialNum1 = factorial(num1); // Calculate factorial of 5
        long factorialNum2 = factorial(num2); // Calculate factorial of 7

        System.out.println("Factorial of " + num1 + " is " + factorialNum1);
        System.out.println("Factorial of " + num2 + " is " + factorialNum2);
    }
}
