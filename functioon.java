
import java.util.*;

public class functioon {

    public static void printMyName(String name) {
        System.out.println("your name is");
        System.out.println(name);

        return;

    }

    public static void main(String[] args) {
        System.out.println("enter you name noob");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);// yeslay function lai call garyo maja lay yadd rakh
        sc.close();

    }
}