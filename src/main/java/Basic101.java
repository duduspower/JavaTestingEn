import java.util.Arrays;

public class Basic101 {
    public static void main(String[] args) {
        int [] array = {10,20,30,10,20,10};
        int element1 = 10;
        int element2 = 20;
        int number1 = 0;
        int number2 = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == element1) {
                number1++;
            }
            else if(array[i] == element2){
                number2++;
            }
        }
        System.out.println("Array : " + Arrays.toString(array));
        System.out.println("Number of " + element1 + " in array : " + number1);
        System.out.println("Number of " + element2 + " in array : " + number2);
    }
}
