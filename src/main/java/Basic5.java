import java.util.Scanner;

public class Basic5 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę");
        int b = scanner.nextInt();
        System.out.println("Wynik : " + a * b);
    }
}
