
//Become the one you wish//
public class patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println("\n");
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println("\n");
        }
        for(int i=1;i<=4;i++){
            for(int j=1; j<=4-i; j++)
            System.out.println(" ");
        
        for(int j=1; j<=i; j++){
            System.out.println();
        }
    }

    }

}
