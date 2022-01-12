import java.util.Scanner;

public class Basic19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int number = in.nextInt();

        String binary = Integer.toBinaryString(number);
        System.out.println("Decimal number : " + number);
        System.out.println("Binary number : " + binary);
    }
}
