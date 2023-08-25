
class Pizza {
    String flavour;
    Byte size;
    int prize;
    String topping;
}

public class PizzaHouse {

    public void addingred(String ingredient1) {
        System.out.println("this pizza contain gradient" + ingredient1);
    }

    public void addingred(String ingredient1, String ingredient2) {
        System.out.println("this pizza contain gradient" + ingredient1);
        System.out.println("this pizza contain gradient" + ingredient2);
    }

    public float develivery(int radius){

        if (radius == 50) {
           // System.out.println("delivery will take 1/2 hour (30mints)");
        return 30.00f;
        }
        else if (radius > 50 && radius <= 100) {
            // System.out.println("this develivery will take minimum 1 hour");
         return 60.00f;
        }
        else if ( radius > 100 ){
            // System.out.println(" the delivery will take 1.5 hours.");
            return 130.00f;
        }
        else 
        return -1;
    }

    Pizza p1 = new Pizza();
    Pizza p2 = new Pizza();
    Pizza p3 = new Pizza();
    Pizza p4 = new Pizza();
    Pizza p5 = new Pizza();

}
