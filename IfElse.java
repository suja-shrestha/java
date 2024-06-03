import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter the age of the user");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if(age>=18){
            System.out.println("You are adult enjouy you'r life");
        }
        else{
            System.out.println("You are just the kid go sleep");
        }
    }
}
