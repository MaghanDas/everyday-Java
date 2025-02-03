import java.util.*;
import javax.lang.model.element.Name;

import org.w3c.dom.NameList;

class History {
    ArrayList<String> NameList = new ArrayList<>();
    ArrayList<Integer> ParameterList = new ArrayList<>();

    History(String name, int parameter) {
        NameList.add(name);
        ParameterList.add(parameter);
    }

    void showHistroy() {
        System.out.println("******************");
        System.out.println("History of Users");
        System.out.println("NAMES OF USERS:::");
        System.out.println("*********************");
        for (String name : NameList) {
            System.out.println(name);
        }
        for (int parameter : ParameterList) {
            System.out.println(parameter);
        }
    }
}

public class calculator {

    static float calculateMomentum(int mass, float velocity) {
        return mass * velocity;
    }

    static float calculateforce(int mass, float acceleration) {
        return mass * acceleration;
    }

    static float calculateSquare(int number) {
        return number * number;
    }

    static float calculateAccelaration(float velocity, int time) {
        return velocity / time;
    }

    public static void main(String[] args) {

        History h1;
        Scanner in = new Scanner(System.in);
        char input;

        do {
            System.out.println("enter your name ");
            String name = in.nextLine();
            System.out.println("Enter your paramter for calculating square");
            int num = in.nextInt();
            h1 = new History(name, num);

            System.out.println("welcome to my calculator");
            System.out.println("press 1 to calculate momentum ");
            System.out.println("press 2 to calculate force ");
            System.out.println("press 3 to calculate square of a number ");
            System.out.println("press 4 to calculate acceleration ");

            int key = in.nextInt();

            switch (key) {
                case 1:
                    System.out.println("enter the value of mass and velocity respectively");
                    int mass = in.nextInt();
                    int velocity = in.nextInt();
                    System.out.println("MOMENTUM :" + calculateMomentum(mass, velocity));
                    break;

                case 2:
                    int mas = in.nextInt();
                    int acceleration = in.nextInt();
                    System.out.println("Force: " + calculateforce(mas, acceleration));
                    break;

                case 3:
                    // System.out.println("enter your number to calculate square");
                    // int num = in.nextInt();
                    System.out.println("Square: " + calculateSquare(num));
                    break;

                case 4:
                    // System.out.println("enter your name ");
                    // name = in.nextLine();
                    System.out.println("Enter the value of velocity & time ");
                    int time = in.nextInt();
                    int v = in.nextInt();
                    System.out.println("Acceleration: " + calculateAccelaration(time, v));
                    break;

                default:
                    System.out.println("USE VALID KEY");
                    break;
            }
            System.out.println("do u wanna continue");
            input = in.next().charAt(0);

        } while (input == 'y');

        System.out.println("do u want to check history");
        char inputt = in.next().charAt(0);
        if (inputt == 'y') {
            h1.showHistroy();
        } else {
            System.out.println("thankyou for your work.");
        }
    }
}