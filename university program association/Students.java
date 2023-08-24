
public class Students {

    private String sname;
    private Department dept;
    
    public Students(String s) {
        sname = s;
    }
    public void SetDepartment(Department d) {
        dept = d;
    }
    public String getName() {
        return sname;
    }

}
