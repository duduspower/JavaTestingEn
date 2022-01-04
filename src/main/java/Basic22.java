import java.util.Scanner;

public class Basic22 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę w systemie binarnym");
        String a = scanner.next();
        int a_dec = Integer.parseInt(a,2);
        System.out.println("Podana liczba w systemie dziesiątkowym wynosi : " + a_dec);
    }
}
