import java.util.Arrays;
import java.util.Scanner;

public class Basic114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String str = in.nextLine();
        int off = 3;


        System.out.println(str);

        char [] array = new char[str.length()];
        char [] ch = str.toCharArray();

        off %= str.length();
        rev(ch, 0, str.length() - off - 1);
        rev(ch, str.length() - off, str.length() - 1);
        rev(ch, 0, str.length() - 1);
        System.out.println("Array : " + Arrays.toString(ch));
    }

    public static void rev(char[] str, int start, int end){
        while(start < end){
            char help = str[start];
            str[start] = str[end];
            str[end] = help;
            start++;
            end--;
        }
    }
}
