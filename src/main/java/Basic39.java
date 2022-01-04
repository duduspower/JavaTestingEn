public class Basic39 {
    public static void main(String[]args)
    {
        int ilosc = 0;
        int maxliczba = 8;

        for(int i = 1; i <= maxliczba; i++){
            for(int j = 1; j <= maxliczba; j++){
                for(int k = 1; k <= maxliczba; k++){
                    if(k != i && k != j && i != j) {
                        ilosc++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Suma wszystkich liczb 3 cyfrowych wynosi : " + ilosc);
    }
}
