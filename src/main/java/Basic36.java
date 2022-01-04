import java.util.Scanner;

public class Basic36 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program do obliczania odległości między dwoma obiektami na powierzchni ziemii");

        double radius = 6371.01;

        System.out.println("Podaj latitude coordinate");
        double lac1 = scanner.nextDouble();

        System.out.println("Podaj longitude coordinate");
        double loc1 = scanner.nextDouble();

        System.out.println("Podaj latitude coordinate 2");
        double lac2 = scanner.nextDouble();

        System.out.println("Podaj longitude coordinate 2");
        double loc2 = scanner.nextDouble();

        lac1 = Math.toRadians(lac1);
        loc1 = Math.toRadians(loc1);
        lac2 = Math.toRadians(lac2);
        loc2 = Math.toRadians(loc2);

        double wynik = radius * Math.acos(Math.sin(lac1) * Math.sin(lac2) + Math.cos(lac1) * Math.cos(lac2) * Math.cos(loc1 - loc2));
        System.out.println("Odległośc pomiędzy tymi dwoma punktami wynosi : " + wynik);
    }
}
