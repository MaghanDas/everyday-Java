import java.io.File;
import java.io.IOException;

public class CreateFile{
    public static void main(String[] args) {

        // creating a file
        try {
            File myfile = new File("myfile.txt");
            if(myfile.createNewFile()){
                System.out.println("file created "+ myfile.getName());
            }
            else {
                System.out.println("file already exists");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
