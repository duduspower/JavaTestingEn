import java.util.Scanner;

public class Basic53 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę");
        int a = in.nextInt();

        System.out.println("Podaj 2 liczbę");
        int b = in.nextInt();

        System.out.println("Podaj 3 liczbę");
        int c = in.nextInt();

        if(a < b & b < c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
