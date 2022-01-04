import java.util.Scanner;

public class Basic43 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do sformatowania : ");
        String plinia = scanner.nextLine();
        System.out.println("\t\t");
        String dlinia = scanner.nextLine();
        System.out.println("\t\t");
        String tlinia = scanner.nextLine();
        String clinia = scanner.nextLine();

        System.out.println(plinia + "\n" + dlinia);
    }
}
