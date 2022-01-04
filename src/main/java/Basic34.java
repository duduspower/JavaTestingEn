import java.util.Scanner;

public class Basic34 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Program do obliczania pola hexagonu : \n\t");
        System.out.println("Podaj a");

        int a = scanner.nextInt();
        double pole = (6 * Math.pow(a,2) / (4 * Math.tan(Math.PI / 6)));

        System.out.println("Pole hexagony to : " + pole);
    }
}
