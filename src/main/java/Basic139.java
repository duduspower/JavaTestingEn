import java.util.Arrays;

public class Basic139 {
    public static void main(String[] args) {
        int [] array = {1,2,3,-6,5,4};
        int index = 4;
        int wynik = 0;

        System.out.println("Array : " + Arrays.toString(array));

        for(int i = 0; i < index; i++){
            wynik += array[i];
        }
        System.out.println("Wynik : " + wynik);
    }
}
