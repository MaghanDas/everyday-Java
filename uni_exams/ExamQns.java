import java.util.ArrayList;

class CustomWrapper {
    private Integer value;

    public CustomWrapper(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

public class ExamQns {
    public static void main(String[] args) {
        ArrayList<CustomWrapper> customList = new ArrayList<>();

        // Adding custom wrapper objects with integer values to the ArrayList
        customList.add(new CustomWrapper(10));
        customList.add(new CustomWrapper(20));
        customList.add(new CustomWrapper(30));

        // Simulating a condition where an exception is thrown
        int targetValue = 25;

        for (CustomWrapper wrapper : customList) {
            if (wrapper.getValue() == targetValue) {
                // Throw a custom exception if the targetValue is found
                throw new RuntimeException("Target value found in the list: " + targetValue);
            }           
        }

        // If the target value is not found, continue with the program
        System.out.println("Target value not found in the list: " + targetValue);

        // Rest of your program logic goes here...
    }
}
