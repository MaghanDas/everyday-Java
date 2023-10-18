import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        File myfile = new File("myfile.txt");
        if(myfile.delete()) {
            System.out.println("file deleted "+ myfile.getName());
        }
        else {
            System.out.println("not deleted :    ( ");
        }
    }
}

// there are so many ways to read , write on files like usinf buffered reader
// fileinputstream and output stream. reader and writer.
// it depend individual that how a person wants to use.