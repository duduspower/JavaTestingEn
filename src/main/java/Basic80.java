public class Basic80 {
    public static void main(String[]args)
    {
        int [] array = {60,30,40};
        if(array[0] > array[array.length - 1]) {
            System.out.println("Większa liczba : " + array[0]);
        }
        else{
            System.out.println("Większa liczba : " + array[array.length - 1]);
        }
    }
}
