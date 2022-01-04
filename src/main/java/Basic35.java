import java.util.Scanner;

public class Basic35 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program do obliczania powierzchni poligonu : ");

        System.out.println("Podaj ilość boków poligonu");
        int c = scanner.nextInt();

        System.out.println("Podaj długość boku");
        int s = scanner.nextInt();

        double pole = (c * Math.pow(6, 2) / (4 * Math.tan(Math.PI / c)));
        System.out.println("Pole poligonu wynosi : " + pole);
    }
}
