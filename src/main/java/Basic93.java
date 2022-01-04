public class Basic93 {
    public static void main(String[] args) {
        int [] array = {10,10,20,20,30,40};
        int last = 0;
        boolean mode = false;
        // false if 10 true if 20

        for(int i = 0; i < array.length; i++)
        {
            if(mode == false) {
                if(last == 10 && array[i] == 10) {
                    System.out.println(last);
                    System.out.println("10 next to 10");
                }
            }
            else {
                if (last == 20 && array[i] == 20) {
                    System.out.println(last);
                    System.out.println("20 next to 20");
                }
            }
             last = array[i];
        }
    }
}
