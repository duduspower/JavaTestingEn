import java.util.Scanner;

public class Basic24 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie binarnym");
        String a = scanner.next();

        int a_dec = Integer.parseInt(a,2);
        String a_oct = Integer.toOctalString(a_dec);

        System.out.println("Podana liczba w systemie dziesiętnym wynosi : " + a_dec);
        System.out.println("Podana liczba w systemie oktalnym wynosi : " + a_oct);
    }
}
