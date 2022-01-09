import java.util.Arrays;

public class Basic106 {
    public static void main(String[] args) {
        int [] array1 = {10,20,30,40,50,60,70};
        int [] array2 = {0,0,0,0,0,0,0};

        for(int i = 0; i < array1.length - 1; i++){
            array2[i] = array1[i + 1];
        }
        array2[array1.length - 1] = array1[0];

        System.out.println("Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
    }
}
