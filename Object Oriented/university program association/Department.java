import java.util.ArrayList;

public class Department {

    private String dname;
    private ArrayList<Students> studentsList = new ArrayList<>();

    public Department(String dname) {
        this.dname = dname;
    }

    public String getName() {
        return this.dname;
    }

    public void addStudents(Students s) {
        studentsList.add(s);
    }

    public void display() {
        for (int i = 0; i < studentsList.size(); i++) {

            System.out.println("Student: " + studentsList.get(i).getName());
        }
    }
}
