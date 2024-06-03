
public class compileTime {
    public static void main(String[] args) {
        printMyName(args[0]);
        printMyName(args[1]);

        
    }
    static void printMyName(String name){
        System.out.printf("Name %s", name);
    }
}
