class Employee extends Visitor {
    String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age, "Employee");
        this.jobTitle = jobTitle;
    }

    public void manageAttraction(Attraction attraction) {
        System.out.println(getName() + " is managing " + attraction.getName());
    }
}
