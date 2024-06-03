public class Crr {
    String make;
    int year;

    Crr(String make, int year) {
        this.make = make;
        this.year = year;

    }

    Crr(String make) {
        this.make = make;
        this.year = 0;

    }

    public static void main(String[] args) {

        Crr crr1 = new Crr("Toyota", 2022);
        Crr crr2 = new Crr("Honda");
        System.out.printf("the name os car is %s and year is %d \n", crr1.make, crr1.year);
        System.out.printf("the name of car is %s \n", crr2.make);
    }
}
