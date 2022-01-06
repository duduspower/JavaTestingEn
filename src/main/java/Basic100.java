import java.util.Arrays;

public class Basic100 {
    public static void main(String[] args) {
        int [] array1 = {10,11,10,20,43,20,50};
        int [] array2 = {10,13,11,20,44,30,50};
        int [] array3 = {0,0,0,0,0,0,0};

        int lenght = 0;
        int diff = 0;

        if(array1.length > array2.length){
            lenght = array2.length;
        }
        else{
            lenght = array1.length;
        }

        for(int i = 0; i < lenght; i++){
            if(array1[i] < array2[i]) {
                diff = array2[i] - array1[i];
            }
            else{
                diff = array1[i] - array2[i];
            }
            array3[i] = diff;

        }
        System.out.println("Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
        System.out.println("Array 3 : " + Arrays.toString(array3));

        if(array3[lenght / 2] != 0){
            System.out.println(array3[lenght / 2]);
        }
        else{
            int wynik = array3[lenght / 2 - 1] + array3[lenght / 2 + 1];
            System.out.println(array3[lenght / 2 - 1]);
            System.out.println(array3[lenght / 2 + 1]);
            System.out.println("Wynik : " + wynik);
        }
    }
}
