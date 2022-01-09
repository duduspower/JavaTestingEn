public class Basic102 {
    public static void main(String[] args) {
        int [] array = {60,45,60,47,89,10,20,45,30};
        int element1 = 10;
        int element2 = 30;
        boolean bool = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == element1 || array[i] == element2){
                System.out.println("True");
                bool = true;
                break;
            }
        }
        if(bool == false){
            System.out.println("False");
        }
    }
}
