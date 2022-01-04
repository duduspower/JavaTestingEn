public class Basic15 {
    static public void main(String[]args)
    {
        int a = 1;
        int b = 2;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.print(a);
        System.out.print(b);
    }
}
