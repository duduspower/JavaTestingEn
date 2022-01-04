import java.util.Scanner;

public class Basic64 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę");
        int a = in.nextInt();

        System.out.println("Podaj 2 liczbę");
        int b = in.nextInt();
        System.out.println("Wynik : " + common(a,b));

    }
    public static boolean common(int x, int y)
    {
        if(x < 25 || y > 75)
            return false;
        int z = x % 10;
        int c = y % 10;
        x /= 10;
        y /= 10;
        return(x == y || x == c || y == z || z == c);
    }
}
