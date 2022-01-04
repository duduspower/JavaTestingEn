import java.util.Arrays;

public class Basic81 {
    public static void main(String[]args)
    {
        int [] array1 = {20,30,40};
        int [] array2 = {array1[array1.length - 1], array1[1], array1[0]};
        System.out.println("Array : " + Arrays.toString(array1));
        System.out.println("Swapped Array : " + Arrays.toString(array2));
    }
}
