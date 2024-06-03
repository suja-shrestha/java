//encapsulation example
public class Student2 {
    public static void main(String[] arge) {
        Student student = new Student();
        student.setName("sujal");
        System.out.printf("Name : %s \n",student.getName());
        student.setAge(12);
        System.out.printf("Age  : %d \n",student.getAge());
    }
}
