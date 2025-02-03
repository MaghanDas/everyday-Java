
// When there is a chain of inheritance, it is known as multilevel inheritance

class Univeristy {

    public void uniDetails() {
        System.out.println("Mehran univeristy");
    }
}

class Department extends Univeristy{
    public void departmentName() {
        System.out.println("softeware department");
    }
}

class Students extends Department{
    public void studentName() {
        System.out.println("name of student: ALI");
    }
}
public class MultiLeveInehritance {
    
    public static void main(String[] args) {
        
    Students s1 = new Students();
    s1.departmentName();
    s1.studentName();
    s1.uniDetails();
}
}
