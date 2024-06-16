public class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for 'name'
    public String getValue() {
        return name;
    }

    // Setter for 'name'
    public void setValue(String name) {
        this.name = name;
    }

    // Getter for 'age'
    public int getValue() {
        return age;
    }

    // Setter for 'age'
    public void setValue(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("Alice", 30);

        // Access the name and age using getter methods
        System.out.println("Name: " + person.getValue());
        System.out.println("Age: " + person.getValue());

        // Modify the name and age using setter methods
        person.setValue("Bob");
        person.setValue(25);

        // Access the modified name and age using getter methods
        System.out.println("Updated Name: " + person.getValue());
        System.out.println("Updated Age: " + person.getValue());
    }
}
