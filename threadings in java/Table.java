import java.util.Scanner;

public class Table extends Thread{
    int a;
    

    public Table(int x){
        this.a = x;
        
    }
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
            x = input.nextInt();
            y = input.nextInt();
        
        Table t1 = new Table(x);
    }
}