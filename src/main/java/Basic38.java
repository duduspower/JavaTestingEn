import java.util.Scanner;

public class Basic38 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo : ");
        String tekst = scanner.nextLine();
        licz(tekst);
    }
    public static void licz(String tekst)
    {
        int litery = 0;
        int liczby = 0;
        int spacje = 0;
        int inne = 0;

        char[] ch = tekst.toCharArray();

        for(int i = 0; i < tekst.length(); i++)
        {
            if(Character.isLetter(ch[i]))
            {
                litery++;
            }

            else if(Character.isDigit(ch[i]))
            {
                liczby++;
            }

            else if(Character.isSpaceChar(ch[i]))
            {
                spacje++;
            }

            else
            {
                inne++;
            }
        }

        System.out.println("Ilość liter : " + litery);
        System.out.println("Ilość liczb :  " + liczby);
        System.out.println("Ilość spacji : " + spacje);
        System.out.println("Ilość innych : " + inne);
        System.out.println("Podany tekst to : " + tekst);
    }
}
