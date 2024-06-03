
import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("-----Simple calculator-----");
        System.out.println("enter the operator (-,+,%,/,*)");
        Scanner op = new Scanner(System.in);
        char operator = op.next().charAt(0);
        System.out.println("enter the numbers");
        Scanner number = new Scanner(System.in);
        System.out.println("enter the number1");
        int num1 = number.nextInt();
        System.out.println("entert the number2");
        int num2 = number.nextInt();
        String messege = String.format("the number are %d and %d", num1, num2);
        System.out.println(messege);
        op.close();
        number.close();
        switch (operator) {
            case '+':
                int sum = num1 + num2;
                String sum1 = String.format("the sum is %d", sum);
                System.out.println(sum1);
                break;
            case '-':
                int minus = num1 - num2;
                String minus1 = String.format("the minus of this two num are %d", minus);
                System.out.println(minus1);
                break;
            case '/':
                int divide = num1 / num2;
                String divid1 = String.format("the divided num is %d", divide);
                System.out.println(divid1);
                break;
            case '*':
                int multiply = num1 * num2;
                String multiply1 = String.format("the multiplication of this number are %d:", multiply);
                System.out.println(multiply1);
                break;
            case '%':
                int remainder = num1 % num2;
                String remainder1 = String.format("the remainder are %d", remainder);
                System.out.println(remainder1);
                break;
            default:
                System.out.println("-----Invalid Calculator-----");
                break;
        }
    }

}
