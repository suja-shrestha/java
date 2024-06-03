public class ContinueExample {
    public static void main(String[] args) {
        // Loop to print numbers from 1 to 10, skipping even numbers
        for (int i = 1; i <= 10; i++) {
            // Check if the current number is even
            if (i % 2 == 0) {
                // If even, skip to the next iteration
                continue;
            }
            // If not even, print the number
            System.out.println(i);
        }
    }
}
