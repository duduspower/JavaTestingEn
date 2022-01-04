import java.util.Scanner;

public class Basic28 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie szesnastkowym");

        String a_hex = scanner.next();
        int a_dec = Integer.parseInt(a_hex,16);

        System.out.println("Podana liczba w systemie dziesiętnym wynosi : " + a_dec);
    }
}
