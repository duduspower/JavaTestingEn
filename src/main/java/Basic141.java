import java.util.Arrays;
import java.util.Scanner;

public class Basic141 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wyraz : ");
        String wyraz = in.nextLine();

        char [] ch = wyraz.toCharArray();
        char [] check = new char[wyraz.length()];
        boolean bool = true;

        for(int k = 0; k < wyraz.length(); k++){
            check[k] = ch[k];
        }

        for(int i = 0; i < wyraz.length(); i++){
            for(int j = 0; j < wyraz.length(); j++){
                    if(check[i] == ch[j]){
                        if(i != j){
                            System.out.println("False");
                            bool = false;
                            break;
                        }
                    }
            }
        }
        if(bool){
            System.out.println("True");
        }
        System.out.println("Wyraz Array : " + Arrays.toString(ch));
        System.out.println("Check Array : " + Arrays.toString(check));
    }
}
