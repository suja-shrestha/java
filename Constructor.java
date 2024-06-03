public class Constructor {
    
         public String name;
        public int roll;
        // Constructor() {
        //         System.out.println("this is a default constructor");
        // }

        Constructor(int roll, String name) {
                this.roll = roll;
                this.name = name;
        }

        public static void main(String[] args) {
                Constructor cons = new Constructor(2, "sujal");
                System.out.printf("the name is %s the age is %d",cons.name, cons.roll);
                
        }
    
}
