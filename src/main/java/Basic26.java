import java.util.Scanner;

public class Basic26 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie oktalnym");
        String a = scanner.next();

        int a_dec = Integer.parseInt(a,8);
        String a_bin = Integer.toBinaryString(a_dec);

        System.out.println("Podana liczba w systemie dziesiętnym = " + a_dec);
        System.out.println("Podana liczba w systemie binarnym = " + a_bin);
    }
}
