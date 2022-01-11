import java.util.Scanner;

public class Basic118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wyraz : ");
        String str = in.nextLine();
        str = str.toLowerCase();
        char check = 'y';
        boolean bool = false;

        char [] ch = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            if(ch[i] == check){
                System.out.println("Znaleziono " + check + " na miejscu " + i);
                bool = true;
                break;
            }
        }
        if(bool){}
        else{
            System.out.println("Char " + check + " not found");
        }
    }
}
