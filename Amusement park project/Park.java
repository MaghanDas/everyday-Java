import java.util.ArrayList;

class Park {
    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Employee> employees;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listAttractions() {
        System.out.println("Attractions at " + name + ":");
        System.out.println("-----------------------------");
        for (Attraction attraction : attractions) {
            System.out.println("- " + attraction.getName());
        }
    }

    public void listEmployees() {
        System.out.println("Employees at " + name + ":");
        System.out.println("-----------------------------");

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (" + employee.jobTitle + ")");
        }
    }

    public String getName() {
        return name;
    }
}