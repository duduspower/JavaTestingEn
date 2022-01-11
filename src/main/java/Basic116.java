public class Basic116 {
    public static void main(String[] args) {
        int max = 100;
        int number1 = 3;
        int number2 = 5;

        for(int i = 1; i < max + 1; i++){
            if(i % number1 == 0){
                System.out.println("Fizz");
            }
            else if(i % number2 == 0){
                System.out.println("Buzz");
            }
            else if(i % number1 == 0 && i % number2 == 0){
                System.out.println("fizz buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
