public class Array {
    public static void main(String[] args) {
        int sum = 0;
        int average =0;
        int[] numbers={2, -9, 0, 5, 12, -25, 22, 9, 8, 12, -100, 234};
        for(int i=0 ; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        average = sum/numbers.length;
        System.out.printf("the average is : %d", average);
    }
}
