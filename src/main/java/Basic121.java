import java.util.Iterator;
import java.util.LinkedList;

public class Basic121 {
    public static void main(String[] args) {
        LinkedList <Integer> link = new LinkedList<Integer>();

        link.add(20);
        link.add(40);
        link.add(60);
        link.add(80);

        int temp = 0;

        System.out.println(link.get(0));
        System.out.print("\n" + link.toString());

        for(int i = 0; i < link.size(); i++) {
            temp = link.get(i);
            link.remove(i);
            System.out.println(temp);
        }
        System.out.print("\n" + link.toString());
    }
}
