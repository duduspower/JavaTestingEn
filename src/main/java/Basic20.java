import java.util.Scanner;

public class Basic20 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie dziesiętnym");
        int a = scanner.nextInt();
        String ahex;
        ahex = Integer.toHexString(a);
        ahex = ahex.toUpperCase();
        System.out.println("Podana liczba w systemie szesnastkowym = " + ahex);
    }
}
