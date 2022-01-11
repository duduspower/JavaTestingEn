import java.util.Scanner;

public class Basic115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        String str = in.nextLine();

        boolean bool = false;
        char [] array = str.toCharArray();

        for(int i = 1; i < str.length() / 2; i++){
            if(array[i - 1] != array[array.length - i]) {
                break;
            }
            else{
                bool = true;
            }
        }
        if(bool){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
