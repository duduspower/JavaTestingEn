import java.util.Scanner;

public class Basic59 {
    static public void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj zdanie ");

        String linia = in.nextLine();
        linia = linia.toLowerCase();

        System.out.println(linia);
    }
}

