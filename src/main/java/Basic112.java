import java.util.Scanner;

public class Basic112 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int check = 0;
        int checkNum = 0;
        int count = 0;

        System.out.println("Podaj liczbę : ");
        int number = in.nextInt();

        String str = Integer.toString(number);
        char [] ch = new char [str.length()];

        for(int i = 0; i < str.length(); i++){
            check = Character.getNumericValue(str.charAt(i));
            if(check == checkNum){
                count++;
            }
        }
    System.out.println("Ilość wystąpień liczby " + checkNum + " w liczbie " + number + " wynosi : " + count);
    }
}
