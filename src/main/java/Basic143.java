import java.util.ArrayList;
import java.util.Arrays;

public class Basic143 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        int [] array1 = {1,2,3,7};
        int [] array2 = {9,13,40};

        for(int i = 0; i < array1.length; i++){
            arrayList1.add(array1[i]);
        }
        for(int j = 0; j < array2.length; j++){
            arrayList2.add(array2[j]);
        }

        System.out.println("Arrray 1 : " + Arrays.toString(array1));
        System.out.println("Arrray 1 : " + Arrays.toString(array2) + '\n');
        System.out.println("Array List 1 : " + arrayList1);
        System.out.println("Array List 2 : " + arrayList2 + '\n');

        for(int x = 0; x < arrayList2.size(); x++){
            arrayList1.add(arrayList2.get(x));
        }

        System.out.println("After Merge : " + arrayList1);
    }
}
