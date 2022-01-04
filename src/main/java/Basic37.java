import java.util.Scanner;

public class Basic37 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst");

        String text = scanner.nextLine(), revStr = "";
        char ch;

        System.out.println("Oryginalne słowo : " + text);

        for(int i=0; i<text.length(); i++)
        {
            ch = text.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println("Odwrócone słowo : " + revStr);
    }
}
