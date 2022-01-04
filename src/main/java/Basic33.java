import java.util.Scanner;

public class Basic33 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");

        int a = scanner.nextInt();
        System.out.println(suma(a));
    }

    public static int suma (int a)
    {
        int sum = 0;
        while (a != 0)
        {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
