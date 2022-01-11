import java.util.Arrays;

public class Basic128 {
    public static void main(String[] args) {
        int [] array1 = {10,2,38,22,38,23};
        int [] array2 = {10,2,38,23,38,23,21};

        int srednia1 = 0;
        int srednia2 = 0;

        if(array1.length % 2 == 0){
            srednia1 = (array1[array1.length / 2] + array1[array1.length / 2 - 1]) / 2;
            System.out.println("Array 1 : " + Arrays.toString(array1) + " jego mediana : " + srednia1);
        }
        else {
            int mediana1 = array1[array1.length / 2];
            System.out.println("Array 1 : " + Arrays.toString(array1) + " jego mediana : " + mediana1);
        }

        if(array2.length % 2 == 0){
            srednia2 = (array2[array2.length / 2] + array2[array2.length / 2 - 1]) / 2;
            System.out.println("Array 2 : " + Arrays.toString(array2) + " jego mediana : " + srednia2);
        }
        else {
            int mediana2 = array2[array2.length / 2];
            System.out.println("Array 2 : " + Arrays.toString(array2) + " jego mediana : " + mediana2);
        }
    }
}
