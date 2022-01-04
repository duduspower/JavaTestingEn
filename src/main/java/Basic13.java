import java.util.Scanner;

public class Basic13 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a");
        double a = scanner.nextDouble();

        System.out.println("Podaj b");
        double b = scanner.nextDouble();

        double pole = a * b;
        double obw = 2 * (a + b);

        System.out.println("Area is " + a + " * " + b + " = " + pole);
        System.out.println("Parimeter is 2 * (" + a + " + " + b + ") = " + obw);
    }
}
