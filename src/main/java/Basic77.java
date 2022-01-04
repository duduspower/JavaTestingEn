public class Basic77 {
    public static void main(String[]args)
    {
        int [] array1 = {10,20,30};
        int [] array2 = {40,50,60};
        int [] array3 = {array1[0],array2[array2.length - 1]};
        System.out.println(array3[0]);
        System.out.println(array3[1]);
    }
}
