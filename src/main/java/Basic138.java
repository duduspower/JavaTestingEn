import java.util.ArrayList;

public class Basic138 {
    public static void main(String[] args) {
        ArrayList<Integer> listaLenght = new ArrayList<Integer>();

        String[] array = {"cat", "flag", "green", "country", "w3resource"};
        int last = 0;
        int check = 0;
        int bigger = 0;


        for(int i = 0; i < array.length; i++){
            listaLenght.add(array[i].length());
        }
        for(int j = 0; j < array.length; j++){
            if(j != 0){
                check = listaLenght.get(j);
                if(last < check){
                    bigger = j;
                }
            }
            else{
                last = listaLenght.get(0);
            }
        }
        System.out.println("Najdłuższe słowo to : " + array[bigger] + " i ma długość " + listaLenght.get(bigger));
    }
}
