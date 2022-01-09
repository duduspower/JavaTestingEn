import java.util.Arrays;
import java.util.Scanner;

public class Basic108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int liczba = 0;
        int pomoc = 0;

        System.out.println("Podaj liczbę dodatnią : ");
        int number = in.nextInt();

        if(number < 0){
            System.out.println("Podałeś liczbę ujemną :: ERROR");
        }
        else{
            String str = Integer.toString(number);
            char [] array = new char[str.length()];
            for(int i = 0; i < str.length(); i++){
                array[i] = str.charAt(i);
                pomoc = Character.getNumericValue(str.charAt(i));
                liczba = liczba + pomoc;
            }
            System.out.println("Array : " + Arrays.toString(array));
            System.out.println("Suma = " + Integer.toString(liczba));
        }
    }
}
