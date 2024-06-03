import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whihc multiplication you want to see");
        int n = sc.nextInt();
        System.out.println("the multiplication table is:");
        for(int i=1; i<=10; i++){
            int multiplication = n*i;
            System.out.println(multiplication);

        }
        sc.close();
       
    }
}
