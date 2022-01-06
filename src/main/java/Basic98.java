public class Basic98 {
    public static void main(String[] args) {
        int [] array = {20,30,20,30,20,30};
        int number = 0;
        int element = 20;
        boolean next = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                number++;
            }
            if(i < array.length - 1) {
                if (array[i + 1] == array[i]) {
                    next = true;
                    break;
                }
            }
        }
        if(number < 3 || number > 3){
            System.out.println("Liczba wystąpień elementu : " + element + " jest różna od 3");
        }
        else{
            System.out.println("Liczba wystąpień elementu : " + element + " jest równa 3");
        }
        if(next == true) {
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        System.out.println(number);
    }
}
