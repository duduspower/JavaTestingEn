import  java.lang.*;

public class Basic91 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int i;

        System.out.println("Liczenie do 10");

        for(i = 1; i<= 10; i++) {
            System.out.println(i);
        }

        long czas = System.nanoTime() - start;
        System.out.println("Czas trwania kodu w nanosekundach : " + czas);
    }
}
