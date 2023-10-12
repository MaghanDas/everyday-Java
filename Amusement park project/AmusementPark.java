
public class AmusementPark {
    public static void main(String[] args) {
        Park mdPark = new Park("MDM PARK");

        RollerCoaster rollerCoaster = new RollerCoaster("ThrillCoaster", 5);
        FerrisWheel ferrisWheel = new FerrisWheel("SkyWheel", 30);
        HauntedHouse hauntedHouse = new HauntedHouse("Spooky Mansion", true);

        mdPark.addAttraction(rollerCoaster);
        mdPark.addAttraction(ferrisWheel);
        mdPark.addAttraction(hauntedHouse);

        Employee employee1 = new Employee("ARBAB", 23, "Manager");
        Employee employee2 = new Employee("RAFY", 18, "looosi employe");

        mdPark.addEmployee(employee1);
        mdPark.addEmployee(employee2);

        System.out.println("**************************************");
        System.out.println("WELCOME TO " + mdPark.getName());
        System.out.println("**************************************");
        System.out.println("PARK ORGANIZER");
        System.out.println("---------------------------------");
        mdPark.listEmployees();
        System.out.println("---------------------------------");
        System.out.println("wanna enjoy ? check out these");
        System.out.println("---------------------------------");

        mdPark.listAttractions();
        System.out.println("---------------------------------");

        Visitor visitor1 = new Visitor("Ahmed", 18, "Adult");
        Visitor visitor2 = new Visitor("Anya", 12, "Child");

        Thread thread1 = new Thread(new VisitAttractionTask1(visitor1, rollerCoaster, ferrisWheel));
        Thread thread2 = new Thread(new VisitAttractionTask2(visitor2, ferrisWheel, hauntedHouse));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n-------details -------");
        System.out.println("------------------------");
        System.out.println("Visitors:");
        System.out.println("------------------------");
        // System.out.println("----------------------");

        visitor1.listVisitedAttractions();
        visitor2.listVisitedAttractions();
         System.out.println("----------------------");
         System.out.println("THANKYOU FOR VISITING...");
          System.out.println("----------------------");
    }
}
