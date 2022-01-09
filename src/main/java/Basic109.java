import java.util.Scanner;

public class Basic109 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;
        char ch = '#';

        System.out.println("Podaj liczbę : ");
        n = in.nextInt();

        if(n > 0){
            System.out.println("Ilość kolumn : " + ((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));
        }
    }
}
