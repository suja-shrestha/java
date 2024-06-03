
import java.util.Scanner;

public class Circle {
    static final double PI = 3.1415;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious");
        int r = sc.nextInt();
        Double Circle = PI * r * r;
        sc.close();
        System.out.printf("the circle is:  %f", Circle);
    }
}
