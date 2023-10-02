package ra.bt3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt());
        }
        Iterator<Integer> iterator = list.iterator();
//        trước khi sắp xếp
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value+ " ");
        }
        Collections.sort(list);
//        sau khi sắp xếp
        System.out.println();
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }
}
