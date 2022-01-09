import java.awt.*;
import java.util.Arrays;

public class Basic104 {
    public static void main(String[] args) {
        int [] array1 = {40,50,60,10,40,50,20};
        int [] array2 = {};
        int element = 10;
        int i = 0;

        System.out.println("Array 1 : " + Arrays.toString(array1));

        while (array1[i] != 10){
            i++;
            array2 = new int[i];
            for(int j = 0; j < i; j++){
                array2[j] = array1[j];
                System.out.println("Array 2 : " + Arrays.toString(array2));
            }
        }
    }
}
