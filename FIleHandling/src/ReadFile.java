import java.io.File;
import java.util.Scanner;

public class ReadFile {
    // we can use scanner class to read on file
    public static void main(String[] args) {
        try {
            File myFile = new File("myfile.txt");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();  // closing the file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}