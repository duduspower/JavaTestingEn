import java.util.Scanner;

public class Basic54 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę");
        int a = in.nextInt();

        System.out.println("Podaj 2 liczbę");
        int b = in.nextInt();

        System.out.println("Podaj 3 liczbę");
        int c = in.nextInt();

        System.out.println(testLastDigit(a, b, c, true));
        }

    public static boolean testLastDigit(int x, int y, int z, boolean abc)
    {
        return (x % 10 == y % 10) || (y % 10 == z % 10) || (x % 10 == z % 10);
    }
}
