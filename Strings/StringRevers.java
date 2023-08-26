public class StringRevers {
    public static void main(String[] args) {
        String str = "Black is Mine Only";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}