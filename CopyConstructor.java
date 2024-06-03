public class CopyConstructor {
    int a;
    int b;

    // Default constructor
    public CopyConstructor() {
        a = 10;  // Assign to instance variable a
        b = 100; // Assign to instance variable b
    }

    // Copy constructor
    public CopyConstructor(CopyConstructor ref) {
        a = ref.a;
        b = ref.b;
    }

    // Method to show the values of a and b
    void show() {
        System.out.println(a + " " + b);
    }

    // Another method to show the values of a and b (not really necessary to have two)
    void showw() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        CopyConstructor original = new CopyConstructor();
        
        // Create a copy of the original object using the copy constructor
        CopyConstructor copy = new CopyConstructor(original);
        
        // Display values of the original object
        original.show();
        
        // Display values of the copied object
        copy.showw();
    }
}
