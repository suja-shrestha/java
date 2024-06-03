import java.util.Scanner;

public class Stringg {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));

        }
        for (int i = name.length()-1; i>=0; i--) {
            System.out.println(name.charAt(i));
            
        }
        sc.close(); 
    }
}
