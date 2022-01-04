import java.util.Scanner;

public class Basic51 {
    public static void main(String[]args)
    {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);

        String tekst = scanner.nextLine();
        int liczba = Integer.parseInt(tekst);
        System.out.println("Podana liczba w formacie int to : " + liczba);
    }
}
