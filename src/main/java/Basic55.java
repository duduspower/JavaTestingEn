import java.util.Scanner;

public class Basic55 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj Liczbę");
        int liczba = in.nextInt();

        int godziny = 0;
        int minuty =  0;
        int sekundy = 0;

        sekundy = liczba % 60;
        godziny = liczba / 60;
        minuty = godziny % 60;
        godziny = godziny / 60;
        System.out.println(godziny + ":" + minuty + ":" + sekundy);
    }
}
