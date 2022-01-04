import java.util.Scanner;

public class Basic25 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie oktalnym");
        String a = scanner.next();
        int a_dec = Integer.parseInt(a,8);
        System.out.println("Podana liczba w systemie dziesiętnym wynosi : " + a_dec);
    }
}
