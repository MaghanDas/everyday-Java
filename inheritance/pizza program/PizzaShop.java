import java.util.ArrayList;

public class PizzaShop {
    private String shopName;
    private ArrayList<Pizza> flavoursOffered =  new ArrayList<>();
    private int phoneNo;
    public PizzaShop(String shopName, ArrayList<Pizza> flavoursOffered, int phoneNo){
        this.shopName=shopName;
        this.phoneNo=phoneNo;
        for(int i=0; i<flavoursOffered.size(); i++){
            this.flavoursOffered.add(flavoursOffered.get(i));
        }
    }
    public void displayFlavoursWithPrice(){
        for(int i=0; i<this.flavoursOffered.size(); i++){
            System.out.println(flavoursOffered.get(i));
        }
    }
    public short calculateAmount(String [] pizzas){
        short totalAmount = 0;
        for(int i=0; i<this.flavoursOffered.size(); i++){
            for(int j=0; j< pizzas.length; j++){
                if(this.flavoursOffered.get(i).getFlavour().equalsIgnoreCase(pizzas[j]))
                    totalAmount+=this.flavoursOffered.get(i).getPrice();
            }
        }
        return totalAmount;
    }
}
 