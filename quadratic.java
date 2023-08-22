// java program to calculate the roots of a quadratic equation

import java.util.*;
import java.lang.Math;

public class quadratic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char input;

        do {

            System.out.println(" input the valuse of a, b, c");
            float a = sc.nextInt();
            float b = sc.nextInt();
            float c = sc.nextInt();

            double d = b * b - 4.0 * a * c;

            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
            System.out.println("************************");
            System.out.println("do you want to continue ('y' / 'N')");
            input = sc.next().charAt(0);

        } while (input == 'y' || input == 'Y');
    }
}
