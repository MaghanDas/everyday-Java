
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pizza p1=new Pizza("great favour", (short)1200);
        Pizza p2=new Pizza("green Chilli", (short)1500);
        Pizza p3=new Pizza("new Chilli", (short)800);
        Pizza p4=new Pizza("tasty flavour", (short)2000);

        ArrayList<Pizza> pizzas1 = new ArrayList<>();
        pizzas1.add(p1);
        pizzas1.add(p2);

        ArrayList<Pizza> pizzas2 = new ArrayList<>();
        pizzas2.add(p3);
        pizzas2.add(p4);

        PizzaShop shop1= new PizzaShop("Pizza hut",pizzas1, 1348);
        PizzaShop shop2= new PizzaShop("Domino ",pizzas2, 1230);

       

        PizzaOrders order1=new PizzaOrders(shop1);
        PizzaOrders order2=new PizzaOrders(shop2);


        order1.makeOrder("great favour", "green Chilli");
        order1.calculateTotalAmount();
        order1.printOrders();


        order2.makeOrder("new Chilli", "green Chilli","tasty flavour");
        order2.calculateTotalAmount();
        order2.printOrders();

    }
}