public class Basic84 {
    public static void main(String[]args)
    {
        String word = "Java";
        String wordSub = word.substring(word.length() - 3, word.length());

        System.out.println("Powstały wyraz : " + wordSub + word + wordSub);
    }
}
