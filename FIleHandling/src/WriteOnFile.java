import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {

    public static void main(String[] args) {

    try{
        FileWriter myWriter = new FileWriter("myfile.txt");
            myWriter.write("filing is really easy in java");
            myWriter.write("but it requires some extra efforts");
            myWriter.close();

    }
    catch(IOException e) {
        e.printStackTrace();
    }
  }
}


