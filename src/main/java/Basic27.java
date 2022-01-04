import java.util.Scanner;

public class Basic27 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie oktalnym");
        String a_oct = scanner.next();

        int a_dec = Integer.parseInt(a_oct,8);
        String a_hex = Integer.toHexString(a_dec);

        System.out.println("Podana liczba w systemie dziesiętnym wynosi : " + a_dec);
        System.out.println("Podana liczba w systemie szesnastkowym wynosi : " + a_hex);
    }
}
