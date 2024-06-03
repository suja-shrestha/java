public class Constructorss {
    public String name;
    public int kg;

    Constructorss(int kg, String name){
        this.name = name;
        this.kg = kg;

    }
    public static void main(String[] args) {
        Constructorss cons = new Constructorss(10,"mango");
        System.out.printf("the tasty fruit is %s and i want to but %d kg", cons.name, cons.kg);

    }
    
}
