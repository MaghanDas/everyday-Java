
public class Recursion{


    static int recursion(int num) {


    for(int i =4; i>=1; i++) {
         num = i*num;
    }
        return num;
    }
    public static void main(String[] args) {
        int num = 4;
        int result = recursion(num);
        System.out.println(result);
    }
}