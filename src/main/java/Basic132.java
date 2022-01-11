import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Basic132 {
    public static void main(String[] args) {
        int [] array = {1,1,2,3,3,3,4,5,6,7,7,7,7};
        int lenght = array.length;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int x : array){
            arrayList.add(x);
        }

        Collections.sort(arrayList);

        for(int i = 0; i < lenght; i++){
            if(i > 0){
                if(arrayList.get(i).equals(arrayList.get(i - 1))){
                    arrayList.remove(i);
                    lenght--;
                }
            }
        }
        System.out.println("Array : " + Arrays.toString(array) + " lenght " + array.length);
        System.out.println("List of Array : " + arrayList + " lenght " + arrayList.size());
    }
}
