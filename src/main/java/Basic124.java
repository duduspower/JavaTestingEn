import java.util.Scanner;

public class Basic124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array = {1,2,4,5,8};
        boolean bool = false;

        System.out.println("Podaj liczbę której szukać : ");
        int check = in.nextInt();

        for(int x = 0; x < array.length; x++){
            if(array[x] == check){
                System.out.println("Znaleziono!");
                System.out.println("Liczba " + check + " znajduje się na miejscu o indexie " + x);
            }
        }
        if(bool){}
        else {
            System.out.println("Nie znaleziono liczby " + check + " w arrayu");
            int next = array.length + 1;
            System.out.println("Liczbę można zapisać na miejscu : " + next);
        }
    }
}
