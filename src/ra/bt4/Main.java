package ra.bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        Tạo String
        String str = "Rekkei Academy để nông dân biết code";
        String[] strSplit = str.split(" ");
//        Tạo list từ mảng string
        List<String> list = new ArrayList<String>(Arrays.asList(strSplit));
        ListIterator<String> listIterator = list.listIterator();
//        Duyệt list và in ra các phần tử có nhiều hơn 3 ký tự
        for (String s : list){
            if (s.length() >= 3){
                System.out.print (s + " ");
            }
        }

    }
}
