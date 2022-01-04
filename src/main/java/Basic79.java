import java.util.Arrays;

public class Basic79 {
    public static void main(String[]args)
    {
        int [] array = {20,30,40};
        System.out.println("Oryginal " + Arrays.toString(array));
        int [] newarray = {array[1], array[2], array[0]};
        System.out.println("Rotated " + Arrays.toString(newarray));
    }
}
