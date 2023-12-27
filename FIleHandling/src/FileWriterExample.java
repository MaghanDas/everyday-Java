import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        
            try {
                FileWriter writer = new FileWriter("file.txt");
                writer.write("this is text im writing.....");
                writer.write("this is something really cool..");
                writer.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
