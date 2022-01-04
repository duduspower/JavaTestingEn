import java.util.Scanner;

public class Basic42 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło");
        String haslo = scanner.nextLine();
        System.out.println("Powtórz hasło");
        String hasloCheck = scanner.nextLine();

        if(haslo.equals(hasloCheck) == true){
            System.out.println("Podane hasło to : " + haslo);
        }
        else{
            System.out.println("Hasła się nie zgadzają!");
        }
    }
}
