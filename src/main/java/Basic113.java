import java.util.Arrays;

public class Basic113 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = {2,5,7,8};
        int [] array3 = new int [array1.length + array2.length];

        if(array1.length != array2.length){
            System.out.println("Ilość podanych liczb w arrayu musi być równa");
        }

        for(int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        for(int j = 0; j < array2.length; j++)
        {
            array3[j + array1.length] = array2[j];
        }
        System.out.println("Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
        System.out.println("Array 3 before sorting: " + Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println("Array 3 after sorting: " + Arrays.toString(array3));

    }
}
