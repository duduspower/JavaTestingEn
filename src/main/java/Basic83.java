import java.util.Arrays;

public class Basic83 {
    public static void main(String[]args)
    {
        int [] array1 = {1, 3, -5, 4};
        int [] array2 = {1, 4, -5, -2};

        String wynik = "";

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        for(int i = 0; i < array1.length; i++){
            int num1 = array1[i];
            int num2 = array2[i];
            wynik += Integer.toString(num1 * num2) + " ";
        }
        System.out.println("Wynik : " + wynik);
    }
}
