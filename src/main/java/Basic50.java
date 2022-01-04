public class Basic50 {
    public static void main(String[]args)
    {
        int maxLiczba = 100;
        int dzielnik1 = 3;
        int dzielnik2 = 5;

        System.out.println("");
        System.out.println("Liczby podzielne przez " + dzielnik1);
        for(int i = 1; i <= maxLiczba; i++){
            if(i % dzielnik1 == 0){
                System.out.print(i + ",");
            }
        }

        System.out.println("");
        System.out.println("Liczby podzielne przez " + dzielnik1);
        for(int i = 1; i <= maxLiczba; i++){
            if(i % dzielnik2 == 0){
                System.out.print(i + ",");
            }
        }

        System.out.println("");
        System.out.println("Liczby podzielne przez " + dzielnik1 + " i " + dzielnik2);
        for(int i = 1; i <= maxLiczba; i++){
            if(i % dzielnik1 == 0 & i % dzielnik2 == 0){
                System.out.print(i + ",");
            }
        }
    }
}
