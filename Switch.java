import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("enter the age of the user");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        switch (age) {
            case 1:
                System.out.println("You entered one");

                break;
            case 2:
                System.out.println("You entered two");

                break;

            default:
                System.out.println("You entered other number");
                break;
        }

    }
}
