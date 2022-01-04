public class Basic72 {
    public static void main(String[]args)
    {
        String str = "xyz";
        int len = str.length();
        if(len >= 3) {
            System.out.println(str.substring(0,3));
        }
        else if(len == 1){
            System.out.println(str.charAt(0) + "##");
        }
        else{
            System.out.println("###");
        }
    }
}
