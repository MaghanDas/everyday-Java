package seesionalTest2;

public class Main {
    
    public static void main(String[] args) {
        
        Vehicle v1 = new Bus("Big Wheeler", 100, "NYC", "heno", 100000, "red");

        v1.Color();
        v1.Price();
        v1.Running();
    }
}
