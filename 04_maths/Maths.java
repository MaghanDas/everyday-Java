import java.util.function.ToIntFunction;

public class Maths {

  public static void main(String[] args) {

    // USE MATH CLASS FOR EXPONENTIAL, SQUARE ROOT, LOGARITHM, TRIGONOMETRIC
    // hover on the functions to know more!!
    // Math.exp(x)
    System.out.println(Math.exp(2)); // e^2
    // Math.sqrt(x)
    System.out.println(Math.sqrt(16));
    System.out.println(Math.sqrt(-6)); // NaN

    // Math.log(x), Math.log10(x)
    System.out.println(Math.log(1));
    // Math.pow(x,y)
    System.out.println(Math.pow(2, 3));
    // Math.abs(x)
    System.out.println(Math.abs(-3));
    // Math.min(x,y), Math.max(x,y)
    System.out.println(Math.min(3, 5));
    System.out.println(Math.max(3, 5));
    // Math.random()
    System.out.println(Math.random());
    System.out.println((int) (Math.random() * 100));
    System.out.println((int) ((Math.random() * 100) / 10));
    // Math.PI, Math.E
    System.out.println(Math.PI);
    System.out.println(Math.E);
    // Math.sin(x), Math.cos(x) , Math.tan(x)
    System.out.println(Math.sin(60));
    // Math.asin(x)
    // Math.toDegrees(x), Math.toRadians(x)
    // Math.sinh(x), Math.cosh(x), Math.tanh(x), Math.asinh(x), Math.acosh(x),
    // Math.atanh(x)

  }
}