import java.util.Arrays;

public class Basic95 {
    public static void main(String[] args) {
        int n = 5;
        String [] array = new String[n];

        for(int i = 0; i < 5; i++){
            array[i] = String.valueOf(i);
            System.out.println("New Array : " + Arrays.toString(array));
        }
    }
}
