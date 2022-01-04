import java.util.Scanner;

public class Basic65 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę : ");
        int a = in.nextInt();

        System.out.println("Podaj 2 liczbę : ");
        int b = in.nextInt();

        int dzielnik = a / b;
        int wynik = a - dzielnik * b;
        System.out.println("Wynik : " + wynik);
    }
}
