import java.util.ArrayList;

public class University {

    private String uname;
    private ArrayList<Students> studentsList = new ArrayList<Students>();
    private ArrayList<Department> departmentsList = new ArrayList<Department>();

    public University(String[] sname, String[] dname) {

        for (int i = 0; i < sname.length; i++) {
            studentsList.add(new Students(sname[i]));
        }

        for (int i = 0; i < dname.length; i++) {
            departmentsList.add(new Department(dname[i]));
        }
    }

    Department getDepartment(String dkey) { 
        for (int i = 0; i < departmentsList.size(); i++) {
            if (departmentsList.get(i).getName().equals(dkey)) {
                return departmentsList.get(i);
            }
        }
         return null;
    }

    Students getStudents(String skey) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getName().equals(skey)) {
                return studentsList.get(i);
            }
        }
        return null;
    }

    public void enrollsIn(Department d, Students s) {
        s.SetDepartment(d);
        d.addStudents(s);
    }

    public void display() {
        for (int i = 0; i < departmentsList.size(); i++) {
            System.out.println("dept name " + departmentsList.get(i).getName());
            departmentsList.get(i).display();
        }
    }
}