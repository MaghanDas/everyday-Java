public class StringBuilderExample{

    public static void main(String[] args) {
        // Create a new StringBuilder instance
        StringBuilder stringBuild = new StringBuilder(" ");
        StringBuilder stringB = new StringBuilder("wah");

        // Appending strings
        stringBuild.append("Hello, ");
        stringBuild.append("this is ");
        stringBuild.append("an example ");
        stringBuild.append("of using StringBuilder.");

        System.out.println(stringB.compareTo(stringBuild));


        
    }
}
