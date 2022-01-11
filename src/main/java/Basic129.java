public class Basic129 {
    public static void main(String[] args) {
        int [] array = {10, 20, 10, 20, 40, 40, 50, 50, 30};
        int check;
        int last = 0;

        boolean bool = false;

        for(int i = 0; i < array.length; i++){
            check = array[i];
            int count = 0;
            for(int j = 0; j < array.length; j++){
                last = array[j];
                if(check == last){
                    count++;
                }
            }
            if(count == 1){
                bool = true;
                System.out.println("Liczba, która się nie powtarza to : " + array[i]);
            }
        }
        if(bool){}
        else{
            System.out.println("Wszystkie liczby powtarzają się conajmniej raz");
        }
    }
}
