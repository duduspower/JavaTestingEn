import java.util.Arrays;
import java.util.Scanner;

public class Basic119 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int number = in.nextInt();
        int check = 7;
        boolean bool = false;

        String str = "";
        str = Integer.toString(number);
        char [] ch = str.toCharArray();
        System.out.println("Array = " + Arrays.toString(ch));

        for(int i = 0; i < str.length(); i++){
            if(Character.getNumericValue(ch[i]) == check){
                System.out.println("Liczba " + check + " została znaleziona na pozycji : " + i);
                bool = true;
                break;
            }
        }
        if(bool){}
        else{
            System.out.println("Liczba " + check + " nie została znaleziona");
        }
    }
}
