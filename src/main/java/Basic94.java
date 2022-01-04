import java.util.Arrays;

public class Basic94 {
    public static void main(String[] args) {
        int [] array = {1,7,8,5,7,13,0,2,4,9};
        int i = 0;

        System.out.println("Array 1 : " + Arrays.toString(array));
        while(i < array.length && array[i] % 2 == 0){
            i++;
        }

        for(int j = 0; j < array.length; j++){
            if(array[j] % 2 != 0) {
                int val = array[i];
                array[i] = array[j];
                array[j] = val;
                i++;
            }
        }
    System.out.println("Array 2 : " + Arrays.toString(array));
    }
}
