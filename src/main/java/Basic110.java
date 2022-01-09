import java.util.Scanner;

public class Basic110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;

        System.out.println("Podaj podstawę potęgi : ");
        double num = in.nextInt();

        System.out.println("Podaj liczbę do sprawdzenia : ");
        int check = in.nextInt();

        for(double i = 0; i < 10; i++){
            if(Math.pow(num, i) == check){
                i = (int) i;
                num = (int) num;
                System.out.println("Liczba " + check + " jest " + i + " potęgą liczby" + num);
                break;
            }
            else{
                System.out.println("Liczba nie znaleziona");
            }
        }
    }
}
