import java.util.ArrayList;

public class Basic142 {
    public static void main(String[] args) {
        String str1 = "wxyz";
        String str2 = "zyxw";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        boolean bool = true;
        int counter = 0;

        if(str1.length() != str2.length()){
            System.out.println("Długość podanych wyrazów jest różna więc nie może zawierać tyle samo tych samych znaków");
            System.exit(0);
        }

        for(int i = 0; i < str1.length(); i++){
            for(int j = 0; j < str1.length(); j++){
                if(ch1[i] == ch2[j]){
                    counter++;
                    break;
                }
            }
        }
        if(counter == 4){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
