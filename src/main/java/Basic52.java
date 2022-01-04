import java.util.Scanner;

public class Basic52 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę");
        int a = in.nextInt();
        System.out.println("Podaj 2 liczbę");
        int b = in.nextInt();
        System.out.println("Podaj 3 liczbę");
        int c = in.nextInt();

        if(a + b == c){
            System.out.println(" 3 liczba jest suma 2 poprzednich : prawda");
        }
        else{
            System.out.println(" 3 liczba jest suma 2 poprzednich : fałsz");
        }
    }
}
