public class PizzaOrders {
    private PizzaShop orderFrom;
    private String[] pizzaSelected ;
    private short totalAmount;

    public PizzaOrders( PizzaShop orderFrom){
        this.orderFrom=orderFrom;
    }
    public void displayFlavours(){
        this.orderFrom.displayFlavoursWithPrice();
    }
    public void makeOrder(String ...pizzaflavours){
        for (int i=0; i<pizzaflavours.length; i++){
            this.pizzaSelected = new String[]{pizzaflavours[i]};
        }
    }
    public void calculateTotalAmount(){
        this.totalAmount=this.orderFrom.calculateAmount(pizzaSelected);

    }
    public void printOrders(){
        this.orderFrom.displayFlavoursWithPrice();
        for(int i=0; i<this.pizzaSelected.length; i++){
            System.out.println(pizzaSelected[i]);;
        }
        System.out.println(this.totalAmount);
       
    }
}