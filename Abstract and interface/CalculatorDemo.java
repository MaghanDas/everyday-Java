
interface Calculator {

    public void add();

    public void sub();

    public void mul();

    public void div();
}

class Casio implements Calculator {
    int firstNum;
    int secondNum;

    public Casio(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public void add() {
        System.out.println("addition " + (firstNum + secondNum));
    }

    public void sub() {
        System.out.println("subtraction " + (firstNum - secondNum));
    }

    public void mul() {
        System.out.println("muliplication " + (firstNum * secondNum));
    }

    public void div() {
        System.out.println("division " + (firstNum / secondNum));

    }
}

class Citizen implements Calculator {
    float firstNum;
    float secondNum;

    public Citizen(float firstNum, float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public void add() {
        System.out.println("addition " + (firstNum + secondNum));
    }

    public void sub() {
        System.out.println("subtraction " + (firstNum - secondNum));
    }

    public void mul() {
        System.out.println("muliplication " + (firstNum * secondNum));
    }

    public void div() {
        System.out.println("division " + (firstNum / secondNum));
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c;
        Casio cs = new Casio(12, 23);
        // Citizen cz = new Citizen(12.4f, 3.5f);

        c = cs;
        c.add();

    }
}
