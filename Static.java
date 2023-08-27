
public class Static {

    // using and understanding the Static keyword.
    // static int count;

    // public Static(){
    // count++;
    // }

    public static void Sum(int... num) {
        int totalSum = 0;
        for (int i = 0; i < num.length; i++) {
            totalSum += num[i];
        }
        System.out.println("the sum is " + totalSum);
        System.out.println("the average is " + ((float) totalSum / 2));
    }

    public static void main(String[] args) {

        // System.out.println("this count values is " + Static.count);
        // Static s1= new Static();
        // Static s2 = new Static();
        // System.out.println("the value of count is now " + Static.count);

        // Variable length arguements
        // The varrags allows the method to accept zero or muliple arguments.
        // syntax is :
        // return_type method_name(data_type... variableName){}

        Sum(1, 2, 3, 4, 5, 6, 7, 8, 0);
    }
}
