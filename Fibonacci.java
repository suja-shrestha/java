import java.util.Scanner;

public class Fibonacci {
    public static void generateFibonacci(int num) {
        int a = 0, b = 1, c;

        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();
        scanner.close();

        generateFibonacci(num);
    }
}
