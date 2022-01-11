import java.util.Scanner;

public class Basic117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        double number = in.nextDouble();

        System.out.println("Pierwiastek liczby " + (int)number + " wynosi : " + (int)Math.sqrt(number));
    }
}
