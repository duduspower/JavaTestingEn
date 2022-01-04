import java.util.Arrays;

public class Basic92 {
    public static void main(String[] args) {
        int [] array = {5,7,2,4,9};
        int par = 0, npar = 0;

        System.out.println("Array : " + Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 ==0) {
                par++;
            }
            else{
                npar++;
            }
        }
        System.out.println("Ilość liczb parzystych : " + par);
        System.out.println("Ilość liczb nieparzystych : " + npar);
    }
}
