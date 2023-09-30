import java.io.File;

public class FileHandling {

    public static void main(String[] args) {
    
        File file = new File("myfile.txt");

        if (file.exists()) {
            System.out.println("this file exist");
            // some methods on files
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            file.isFile(); // true if file exists
            // file.delete(); // delete the file
        }
       else {
        System.out.println("file doesnot exist");
       }
        
    }
}