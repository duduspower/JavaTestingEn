import java.util.ArrayList;
import java.util.Arrays;

public class Basic122 {

    public static void main(String[] args) {
        int [] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val = 3;

        if(array.length % val != 0){
            System.out.println("Nie da się podzielić arraya na równe cześci");
            System.exit(0);
        }

        ArrayList<ArrayList<Integer>> matrixList = new ArrayList();

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        for(int i = 0; i < val; i++){
            arrayList1.add(array[i]);
        }
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for(int j = 0; j < val; j++){
            arrayList2.add(array[j + val]);
        }
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        for(int k = 0; k < val; k++){
            arrayList3.add(array[k + val * 2]);
        }

        matrixList.add(arrayList1);
        matrixList.add(arrayList2);
        matrixList.add(arrayList3);

        System.out.println(matrixList);

        arrayList1.add(0);
        arrayList2.add(0);
        arrayList3.add(0);

        int wynik1 = 0;
        int wynik2 = 0;
        int wynik3 = 0;

        for(int x = 0; x < val; x++){
            wynik1 += arrayList1.get(x);
        }

        for(int y = 0; y < val; y++){
            wynik2 += arrayList2.get(y);
        }

        for(int z = 0; z < val; z++){
            wynik3 += arrayList3.get(z);
        }

        System.out.println("Wynik1 : " + wynik1 + "      Wynik2 : " + wynik2 + "        Wynik3 : " + wynik3);

        if(wynik1 > wynik2){
            if(wynik1 > wynik3){
                System.out.println("Największy wynik to wynik 1 i wynosi : " + wynik1);
            }
        }else if(wynik2 > wynik1){
            if(wynik2 > wynik3){
                System.out.println("Największy wynik to wynik2 i wynosi : " + wynik2);
            }
        }
        else{
            System.out.println("Największy wynik to wynik3 i wynosi : " + wynik3);
        }
    }
}
