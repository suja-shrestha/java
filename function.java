
import java.util.*;

public class function {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int result = add(a, b);
        System.out.println("Sum: " + result);
    }
}
