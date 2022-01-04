import java.util.Scanner;

public class Basic23 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie binarnym");
        String a = scanner.next();
        int a_dec = Integer.parseInt(a,2);
        String a_hex = Integer.toHexString(a_dec);
        a_hex = a_hex.toUpperCase();
        System.out.println("Podana liczba w systemie dziesiętnym wynosi : " + a_dec);
        System.out.println("Podana liczba w systemie szesnastkowym wynosi : " + a_hex);
    }
}
