import java.util.Scanner;

public class Basic6 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę ");
        int a = scanner.nextInt();
        System.out.println("Podaj 1 liczbę ");
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
