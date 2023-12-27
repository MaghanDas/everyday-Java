import java.io.File;

public class CreateFIle {

    public static void main(String[] args) {
        try {
            File myFile = new File("newfile.txt");
            if (myFile.createNewFile()) {
                System.out.println("file created" + myFile.getName());
            } else {
                System.out.println("file alaready exists");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
