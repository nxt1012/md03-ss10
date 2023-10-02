package ra.bt2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt());
        }

        List<Integer> reversedList = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--){
            reversedList.add(list.get(i));
        }

        Iterator<Integer> listIterator = list.iterator();
        Iterator<Integer> reversedListIterator = reversedList.iterator();
        while (listIterator.hasNext()){
            Integer listItem = listIterator.next();
            System.out.print(listItem + " ");
        }
        System.out.println();
        while (reversedListIterator.hasNext()){
            Integer listItem = reversedListIterator.next();
            System.out.print(listItem + " ");
        }
    }
}
