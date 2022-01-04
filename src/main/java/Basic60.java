import java.util.Scanner;

public class Basic60 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadź zdanie");

        String linia = in.nextLine();
        String[] words = linia.split("[ ]+");
        System.out.println("Przedostatnie słowo : " + words[words.length - 2]);
    }
}
