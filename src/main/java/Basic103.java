import java.util.Arrays;

public class Basic103 {
    public static void main(String[] args) {
        int [] array1 = {11, 10, 13, 10, 45, 20, 33, 53};
        int [] array2 = {};
        int element = 10;
        boolean bool = false;

        for(int i = 0; i < array1.length; i++){
            if(array1[i] == 10){
                for(int j = 0; j < array1.length - i - 1; j++){
                    if(array2.length >= j + i){
                        array2[j] = array1[j + i];
                    }
                }
                bool = true;
                break;
            }
        }
        if(!bool){
            System.out.println("False, nie znaleziono elementu : " + element);
        }
        else {
            System.out.println("Array 1 : " + Arrays.toString(array1));
            System.out.println("Array 2 : " + Arrays.toString(array2));
        }
    }
}
