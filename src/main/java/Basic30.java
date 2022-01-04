import java.util.Scanner;

public class Basic30 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie szesnastkowym");
        String a_hex = scanner.next();

        int a_dec = Integer.parseInt(a_hex,16);
        String a_oct = Integer.toOctalString(a_dec);

        System.out.println("Podana liczba w systemie oktalnym wynosi : " + a_oct);
    }
}
