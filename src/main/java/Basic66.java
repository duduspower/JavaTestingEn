import java.util.Scanner;

public class Basic66 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int max = 100;
        int wynik = 0;

        for(int i = 1; i < max + 1; i++)
        {
            wynik = wynik + i;
        }

        System.out.println("Suma " + max + " pierwszych liczb wynosi : " + wynik);
    }
}
