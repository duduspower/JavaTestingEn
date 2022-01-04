import java.util.Scanner;

public class Basic17 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę binarną");
        int a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę binarną");
        int b = scanner.nextInt();
        int suma = a + b;

        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);
        String suma_bin = Integer.toBinaryString(suma);

        System.out.println(bin1);
        System.out.println(bin2);
        System.out.println(suma_bin);
    }
}
