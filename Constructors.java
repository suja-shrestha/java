public class Constructors {
    String name;
    int kg;
    Constructors(){
        name="mango";
        kg= 2;
       
    }
    public static void main(String[] args) {
        Constructors cons = new Constructors();
        System.out.println();
        System.out.printf("the tasty fruit is %s and i want to buy %d kg", cons.name, cons.kg);
    }
}

