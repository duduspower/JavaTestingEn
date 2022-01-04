import java.util.Scanner;

public class Basic58 {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj zdanie : ");
        String line = in.nextLine();

        String upperStarter = "";
        Scanner lineScan = new Scanner(line);

        while(lineScan.hasNext()) {
            String wyraz = lineScan.next();
            upperStarter += Character.toUpperCase(wyraz.charAt(0)) + wyraz.substring(1) + " ";
        }
        System.out.println(upperStarter.trim());
    }
}
