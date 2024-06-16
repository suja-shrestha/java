import java.util.Scanner;

public class Fib {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }
}
