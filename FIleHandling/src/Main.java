import java.io.File;
import java.io.IOException;

// in java there are varoius ways to read and write on files
// it depends upon individual what he wants to use
// like inputstream, outputstreams, filewriter, filereader etc.

public class Main {
    public static void main(String[] args) {

        // creating a file
        try{
            File myfile = new File("myfile.txt");
            if(myfile.createNewFile()){
                System.out.println("file created "+ myfile.getName());
            }
            else {
                System.out.println("file already exists");
            }
        } catch (IOException e){
            e.printStackTrace();
    }}
}