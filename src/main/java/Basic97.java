import java.util.Arrays;

public class Basic97 {
    public static void main(String[] args) {
        int [] array = {10,30,20,20,30,80,90,70};
        int element1 = 30;
        int element2 = 20;

        boolean state1 = false;
        boolean state2 = false;


        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            if(array[i] == element1) {
                if(array[i + 1] == element2) {
                    System.out.println("Both of elements contein in given array");
                    System.out.println("The first one is : " + element1 + " and the second one : " + element2);
                    state1 = true;
                    break;
                }
            }
            else if(array[i] == element2) {
                if(array[i + 1] == element1) {
                    System.out.println("Both of elements contein in given array");
                    System.out.println("The first one is : " + element2 + " and the second one : " + element1);
                    state1 = true;
                    break;
                }
            }
        }
        if(state1 == false){
            System.out.println("False");
        }
        for(int j = 0; j < array.length; j++){
            if(array[j] == element1) {
                if(array[j + 2] == element2) {
                    System.out.println("Both of elements contein in given array");
                    System.out.println("The first one is : " + element1 + " the element of array between " + array[j + 1] +" and the second one : " + element2);
                    state2 = true;
                    break;
                }
            }
            else if(array[j] == element2) {
                if(array[j + 2] == element1) {
                    System.out.println("Both of elements contein in given array");
                    System.out.println("The first one is : " + element2 + " the element of array between " + array[j + 1] + "and the second one " + element2);
                    state2 = true;
                    break;
                }
            }
        }
        if(state2 == false) {
            System.out.println("False");
        }
    }
}
