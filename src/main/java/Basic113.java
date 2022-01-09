import java.util.Arrays;

public class Basic113 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = {2,5,7,8};
        int [] array3 = new int [array1.length + array2.length];

        if(array1.length != array2.length){
            System.out.println("Ilość podanych liczb w arrayu musi być równa");
        }

        for(int i = 0; i < array3.length - 1; i++){
            if(i < 1) {
                array3[i] = array1[i];
                array3[i + 1] = array2[i];
            }
            else{
                array3[i] = array1[i / 2];
                array3[i + 1] = array2[i / 2];
            }
        }
        System.out.println("Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
        System.out.println("Array 3 : " + Arrays.toString(array3));
    }
}
