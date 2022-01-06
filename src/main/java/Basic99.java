public class Basic99 {
    public static void main(String[] args) {
        int [] array = {10,20,10,20,10,20};
        int element = 20;
        boolean bool = false;

        for(int i = 0; i < array.length; i++){
            if(i < array.length - 2) {
                if (array[i] == array[i + 2]) {
                } else {
                    System.out.println("False");
                    bool = true;
                    break;
                }
            }
        }
        if(bool == false) {
            System.out.println("True");
        }
    }
}
