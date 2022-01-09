public class Basic107 {
    public static void main(String[] args) {
        int [] array = {10,11,12,13,14,15,16};
        int diff = 1;
        int repeat = 3;
        int count = 0;
        boolean bool = false;

        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] - diff) {
                count++;
            }else {
                count = 0;
            }

            if (count == repeat) {
                System.out.println("Found");
                bool = true;
                break;
            }
        }
        if(bool == false){
            System.out.println("Ciąg liczb nie został znaleziony");
        }
    }
}

