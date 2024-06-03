import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        System.out.println("Enter the age of the use: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if(age>18){
            System.out.println("You are adult");
        }

    }
}
