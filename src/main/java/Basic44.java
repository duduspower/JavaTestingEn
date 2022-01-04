import java.util.Scanner;

public class Basic44 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę");
        String liczba1 = scanner.nextLine();
        System.out.println("Podaj 2 liczbę");
        String liczba2 = scanner.nextLine();

        System.out.println("Suma podanych znaków wynosi : " + liczba1 + liczba2);
    }
}
