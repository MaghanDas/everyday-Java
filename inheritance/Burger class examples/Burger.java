
public class Burger {
    private int price;
    private String Bname;

    Burger(String Bname, int price) {
        this.Bname = Bname;
        this.price = price;
    }

    public void makeBurger() {
        System.out.println("making burger");
    }
}