
public class operators {

    public static void main(String[] args) {

        int x = 9;
        int y = 8;
        int z = 5;

        // // working with arthematic operators
        // System.out.println(" sum = " + (x + y)); // 17
        // System.out.println(" diff = " + (x - y)); // 1
        // System.out.println(" mult = " + (x * y)); // 72
        // System.out.println(" div = " + (x / y)); // 1
        // System.out.println(" mod = " + (x % y)); // 1

        // working with bitwise operators

        System.out.println(" x & y & z = " + (x & y & z));
        System.out.println(" x | y | z = " + (x | y | z));
        System.out.println(" x ^ y ^ z = " + (x ^ y ^ z));
        System.out.println("Bitwise Left Shift: x<<2 = " + (x << 2));
        System.out.println("Bitwise Right Shift: x>>2 = " + (x >> 2));
         
        // System.out.println(" ~x = " + (~x)); // -10

        // working with integar to binary string

        // System.out.println("converting integar "+ x +" to binary string: "+
        // Integer.toBinaryString(x) );
        // System.out.println("converting integar "+ y +" to binary string: "+
        // Integer.toBinaryString(y) );

        // java relational or comparison operators
        // if (x == 9) System.out.println("x is odd number");
        // if (x <= 9) System.out.println("x is single digit positive number");

        // // java logical operators
        // if ( x > 0 && x < 10 ){
        // System.out.println("x is in between 0 and 10");
        // }
        // if (y > 0 || y > 10) {
        // System.out.println("y canbe a double digit number");
        // }

    }
}
