package exam01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2); //오름차순: 기존 String 정렬기준과 동일
                return o2.compareTo(o1); // 내림차순
                //return o1.compareTo(o2) * -1; // 내림차순
            }
        };
        //Set<String> names = new TreeSet<>(comp);  // 정렬기준 제공
        Set<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("이름4");
        names.add("이름3");
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름5");
        System.out.println(names);
    }
}
