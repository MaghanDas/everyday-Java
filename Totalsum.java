public class Totalsum {

    public static void main(String[] args) {

        long num = 1;

        for (int i = 1; i <= 30; i++) {
            num += num;
            System.out.println(num);
        }
        // System.out.println(num);
    }
}
