import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basic131 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7};
        int lenght = array1.length;
        int lenghtNew = array1.length;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int j : array1) {
            arrayList.add(j);
        }
        Collections.sort(arrayList);
        for (int x = 0; x < lenghtNew; x++) {
            if (x > 0) {
                if (arrayList.get(x).equals(arrayList.get(x - 1))) {
                    arrayList.remove(x);
                    lenghtNew--;
                }
            }
        }

        System.out.println("Array : " + Arrays.toString(array1));
        System.out.println("List of Array : " + arrayList);

        System.out.println("Długość przed : " + lenght);
        System.out.println("Długość po : " + lenghtNew);
    }
}
