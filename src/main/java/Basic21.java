import java.util.Scanner;

public class Basic21 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie dziesiętnym");
        int a = scanner.nextInt();
        String a_oct = Integer.toOctalString(a);
        System.out.println("Podana liczba w systemie oktalnym wynosi = " + a_oct);
    }
}
