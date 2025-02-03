package seesionalTest2;

public class Vehicle {

    private String vehicleType;
    private int capacity;
    private String companyHeadQuarter;

    public Vehicle(String vehicleType, int capacity, String companyHeadQuarter){

        this.capacity = capacity;
        this.companyHeadQuarter = companyHeadQuarter;
        this.vehicleType = vehicleType;
    }
    public void Running(){
        System.out.println("vehicle is running fast");
    }

    public void Color(){
        System.out.println("The vehicle has a nice color ");
    }
    
    public void Price(){
        System.out.println("The vehicle is expensive ");
    }
}