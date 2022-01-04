import java.util.Scanner;

public class Basic49 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if(liczba % 2 == 0){
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba nie jest parzysta");
        }
    }
}
