
//DO IT YOURSELF//

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Hello NOOBS OO");
        }
        for (int num = 0; num < 11; num++) {
            System.out.println(num);
        }
        int i = 0;
        while (i < 11) {
            System.out.println("HELLO DUCKS");
            i++;
        }
        int j = 0;
        do {
            System.out.println("HELLO BIRDS");
            j++;
        } while (j < 11);
        int sum=0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

}
