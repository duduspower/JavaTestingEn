public class Basic86 {
    public static void main(String[]args)
    {
        int n = 105;
        do {
            if(n % 2 == 0) {
                n = n / 2;
            }
            else{
                n = n * 3 + 1;
            }
            System.out.println(n);
        }while(n != 1);
    }
}
