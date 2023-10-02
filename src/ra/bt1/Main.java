package ra.bt1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Tạo danh sách có tối đa 10 phần tử
        List<Integer> list = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt());
        }
//        In danh sách số nguyên
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer obj = it.next();
            System.out.print(obj + " ");
        }
//       Sử dụng phương thức Collections.max để tìm và in ra phần tử lớn nhất
        System.out.print("Phần tử lớn nhất trong danh sách là: " + Collections.max(list));
    }
}
