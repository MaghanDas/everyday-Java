// write a java program that demonstrates the use of exception handling and manipulation of 
// an arraylist of custom objects.
// consider a class "Record" with attributes name(string) and year(int)
// program should have a public class "RecordManagement" : create an Arraylist to store 
// instances of Record objects , implement a method addRecord(Record r ) that adds a Record 
// object to the arraylist. this method should throw an exception "Exception" , if the
//  record's year is below 1996 or above 2023.implement a method printRecords() that 
//  iterates through the Arraylist and prints the details of each record.
// In main method, you should add a single Record object with static Data name =  "MY song",
//  year = 1995 using addRecord method, and print the record added using printRecords() 
//  method

import java.util.ArrayList;

class Record {
    private String name;
    private int year;

    public Record(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

public class RecordManagement {
    private ArrayList<Record> records = new ArrayList<>();

    public void addRecord(Record r) throws Exception {
        if (r.getYear() < 1996 || r.getYear() > 2023) {
            throw new Exception("Invalid year for the record. Year must be between 1996 and 2023.");
        }
        records.add(r);
    }

    public void printRecords() {
        for (Record record : records) {
            System.out.println("Name: " + record.getName() + ", Year: " + record.getYear());
        }
    }

    public static void main(String[] args) {
        RecordManagement recordManager = new RecordManagement();

        try {
            Record mySong = new Record("MY song", 1995);
            recordManager.addRecord(mySong);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        recordManager.printRecords();
    }
}
