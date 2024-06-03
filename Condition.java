import java.util.*;

//WE CAN WE SHOULD AND WE WILL//
public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("This person is a CryBaby");
        } else {
            System.out.println("This person is SIGMA");
        }
        if (age % 2 == 0) {
            System.out.println("This is even. YOU PRO");
        } else {
            System.out.println("This is odd. YOU NOOB XD");
        }
        sc.close();
    }
}
