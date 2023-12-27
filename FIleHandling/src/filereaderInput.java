import java.io.InputStreamReader;
// inputStreamReader has lots of subClassess like filereader,

public class filereaderInput {

    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("enter some letters");
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
