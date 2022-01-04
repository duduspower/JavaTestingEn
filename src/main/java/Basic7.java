import java.util.Scanner;

public class Basic7 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int a = scanner.nextInt();
        int wynik = a;
        System.out.println(a + " x 1" + wynik);

        for (int i = 2; i < 11; i++)
        {
            wynik = wynik + a;
            System.out.println(a + " x " + i + " = " + wynik );
        }
    }
}
