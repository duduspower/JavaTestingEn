import java.util.Scanner;

public class Basic29 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie szesnastkowym");
        String a_hex = scanner.next();

        int a_dec = Integer.parseInt(a_hex,16);
        String a_bin = Integer.toBinaryString(a_dec);

        System.out.println("Podana liczba w systemie binarnym wynosi : " + a_bin);
    }
}
