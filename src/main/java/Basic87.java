import java.util.Scanner;

public class Basic87 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int val = in.nextInt();
        String strVal = Integer.toString(val);
        char [] numer  =strVal.toCharArray();
        int suma = 0;

        for(int i = 0; i < numer.length; i++) {
            suma += numer[i] - '0';
        }
        System.out.println("Suma wynosi : " + suma);
    }
    public static void printNum(int a)
    {
        String [] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    }
}
