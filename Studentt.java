public class Studentt {
    private String name;
    private int age;
    private int rollNo;

    public Studentt(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {

        Studentt student1 = new Studentt("John Doe", 20, 101);
        System.out.printf(" NAME: %s \n AGE: %d\n ROLLNO: %d\n", student1.name, student1.age, student1.rollNo);

    }
}
