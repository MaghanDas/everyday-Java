// java finally block is a block used to execute important code such as closing the
// connection, etc.
// Java finally block is always executed whether an exception is handled or not.
// Therefore, it contains all the necessary statements that need to be printed regardless 
// of the exception occurs or not.
// The finally block follows the try-catch block.

public class FinallyBlock {
    public static void main(String[] args) {

        // case 1 :
        // when there is no exception
        // try {
        //     int a = 4/0;
        // } catch (Exception e) {
        //     System.out.println("exception occured if any");
        // } finally {
        //     System.out.println("finally block is executed");
        // }
        // System.out.println("rest of the code");

        // case:2
        // WHEN there is an exception but not handled

        try {
            int a[] = new int[5];
            a[5] = 14/0;
        } catch (Exception e) {
            
            System.out.println("arrays index exception");
        }
        finally{
            System.out.println("fianlly block is always executed");
        }
        System.out.println("other code statements");
    }
}