public class Basic73 {
    public static void main(String[]args)
    {
        String str1 = "Java";
        String str2 = "";

        if(str1.length() < 1){
            str1 = "#";
            System.out.println(str2.substring(0,1) + str1);
        }
        if(str2.length() < 1) {
            str2 = "#";
            System.out.println(str1.substring(0,1) + str2);
        }
        else {
            System.out.println(str1.substring(0,1) + str2.substring(str2.length()));
        }
    }
}
