import java.nio.charset.Charset;

public class Basic40 {
    public static void main(String[]args)
    {
        System.out.println("Lista dostępnych zbiorów znaków : ");
        for(String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
