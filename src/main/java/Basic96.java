import java.util.Arrays;

public class Basic96 {
    public static void main(String[] args) {
        int szukana1 = 10;
        int szukana2 = 20;
        boolean bool1 = false;
        boolean bool2 = false;
        int pozycja1 = 0;
        int pozycja2 = 0;

        int [] array = {10,30,40,23324,234,20,45,24};
        System.out.println("Array : " + Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            if(array[i] == szukana1){
                bool1 = true;
                pozycja1 = i;
            }
            else if(array[i] == szukana2){
                bool2 = true;
                pozycja2 = i;
            }

            if(bool1 == bool2){
                System.out.println("\nZnaleziono w zbiorze liczbę " + szukana1 + " na pozycji " + pozycja1 + " i liczbę " + szukana2 + " na pozycji " + pozycja2);
                break;
            }
        }
    }
}
