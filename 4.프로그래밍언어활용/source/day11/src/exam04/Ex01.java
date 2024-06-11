package exam04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

        //ArrayList<String> names = new ArrayList<>();
        List<String> names = new LinkedList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이믈4");
        names.add("이름5");

        // 앞에서부터 지우면 지울때마다 새로 배열 생성되고 다 지워지지 않는다
        for(int i = 0; i < names.size(); i++) {
            names.remove(i);
        }

        // 거꾸로 뒤에서부터 제거하면 새로 배열을 만들지 않으므로 다 제거됨
        //for(int i = names.size() - 1; i >= 0 ; i--) {
        //    names.remove(i);
        //}


        System.out.println(names); //names.toString() -> 담긴 값을 확인할 수있도록 재정의

        for(int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.printf("%d) %s%n", i, name);
        }
    }
}
