import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Basic144 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę do usunięcia : ");

        int number = in.nextInt();
        int [] array = {1,4,6,7,6,2};
        int lenght = array.length;

        boolean bool = true;

        System.out.println("Array Before : " + Arrays.toString(array) + " lenght : " + array.length);

        for(int i = 0; i < array.length; i++){
            arrayList.add(array[i]);
        }

        for(int j = 0; j < lenght; j++){
            if(arrayList.get(j) == number){
                arrayList.remove(j);
                lenght--;
                bool = false;
            }
        }
        if(bool){
            System.out.println("Nie znaleziono w arrayu liczby " + number);
        }
        else {
            System.out.println("Array After : " + arrayList + " lenght : " + arrayList.size());
            int diff = array.length - arrayList.size();
            System.out.println("Usunięto " + diff + " liczby");
        }
    }
}
