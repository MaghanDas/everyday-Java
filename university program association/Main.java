
public class Main {

    public static void main(String[] args) {
        
        String[] snames = { "ALI", "GOHAR", "ZOHAIB"};
        String[] dnames = {"CS", "SW"};

        University muet = new University(snames, dnames);
        muet.enrollsIn(muet.getDepartment("SW"), muet.getStudents("ALI"));
        muet.enrollsIn(muet.getDepartment("CS"), muet.getStudents("ZOHAIB"));

        muet.display();
    }
}
