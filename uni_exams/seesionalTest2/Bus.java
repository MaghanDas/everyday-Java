package seesionalTest2;

public class Bus extends Vehicle {

    private String busName;
    private Long busPrice;
    private String busColor;

    public Bus(String vehicleType, int capacity, String companyHeadQuarter, String busName, long busPrice, String buscolor) {
        super(vehicleType, capacity, companyHeadQuarter);
        this.busName = busName;
        this.busColor = buscolor;
        this.busPrice = busPrice;
    }

    public void Running(){
        System.out.println("BUS" + busName + "is running fast");
    }

    public void Color(){
        System.out.println("The bus has a nice color " +busColor);
    }
    
    public void Price(){
        System.out.println("The bus has a Price " +busPrice);
    }

}
