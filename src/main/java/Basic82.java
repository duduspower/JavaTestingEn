public class Basic82 {
    public static void main(String[]args)
    {
        int [] array = {100,20,70,80,50,60};
        if(array[0] > array[array.length / 2] && array[0] > array[array.length - 1]) {
            System.out.println("Największy element z listy to : " + array[0]);
        }
        else if(array[array.length - 1] > array[0] && array[array.length - 1] > array[array.length / 2]){
            System.out.println("Największy element z listy to : " + array[array.length - 1]);
        }
        else{
            System.out.println("Największy element z listy to : " + array[array.length / 2]);
        }
    }
}
