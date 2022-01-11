import java.util.Arrays;
import java.util.Scanner;

public class Basic120 {
    public static void main(String[] args) {
        int [][] matrix = { {3, 2, 1, 7},
                            {9, 11, 5, 4},
                            {6, 0, 13, 17},
                            {7, 21, 14, 15} };

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int value = in.nextInt();
        boolean bool = false;
        int a = 0;
        int b = 0;

        for(int i = 0; i < matrix.length; i++) {
            System.out.println("");
            System.out.print("Wiersze : " + i + "     ");

            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(" Kolumna " + j + " Wartość " + matrix[i][j] + "   ");
                if(matrix[i][j] == value){
                    bool = true;
                    a = i;
                    b = j;
                }
            }
        }
        if(bool){
            System.out.println("\n\n");
            System.out.println("Znaleziono liczbę " + value + " w matrixie na pozycji [(x),(y)]  " + a + " , " + b);
        }
        else{
            System.out.println("Liczba " + value + " nie została znaleziona w matrixie ");
        }
    }
}
