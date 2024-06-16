import java.util.Scanner;

public class Factorial{
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }

    }
public static void main(String[] args) {
    int num ;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the num");
    num = sc.nextInt();
    System.out.printf("the factorial of %d is %d ",num , fact(num));
}
}