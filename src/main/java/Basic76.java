public class Basic76 {
    public static void main(String[]args)
    {
        int [] array1 = {10,20,30,50};
        int [] array2 = {10,20,30,50};

        System.out.println(array1[0] == array2[0] && array1[array1.length - 1] == array2[array2.length - 1]);
    }
}
