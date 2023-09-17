
 public class Pizza {
    private String flavour;
    private short price;
    public Pizza(String flavour, short price){
        this.flavour=flavour;
        this.price=price;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public String getFlavour() {
        return flavour;
    }

    public short getPrice() {
        return price;
    }
    public String toString(){
        return ("Flavour : "+this.flavour+" Price : "+this.price);
    }
}