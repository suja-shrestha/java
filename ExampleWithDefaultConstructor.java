public class ExampleWithDefaultConstructor {

    // Fields
    int a;
    String b;

    // Default constructor
    public ExampleWithDefaultConstructor() {
        // Initialize fields with default values
        a = 1;
        b = "hello";
    }

    // Method to display field values
    void show() {
        System.out.println("a: " + a + ", b: " + b);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an object using the default constructor
        ExampleWithDefaultConstructor obj = new ExampleWithDefaultConstructor();
        // Call the show method to display field values
        obj.show();
    }
}
