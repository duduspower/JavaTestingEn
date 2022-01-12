import java.util.ArrayList;
import java.util.Arrays;

public class Basic145 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int [] array = {1,2,3,4,5};
        int number = 2; // index counted from end to start(to delete)

        System.out.println("Array Before : " + Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            arrayList.add(array[i]);
        }
        arrayList.remove(arrayList.size() - number);

        System.out.println("Array After : " + arrayList);
    }
}
