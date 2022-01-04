import java.util.Scanner;

public class Basic61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String word = in.nextLine();

        String revers = "";
        char[] ch = word.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            revers += ch[i];
        }
        System.out.println(revers);
    }
}
