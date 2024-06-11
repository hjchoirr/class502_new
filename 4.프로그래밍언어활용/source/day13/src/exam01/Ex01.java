package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1","이름2","이름3","이름4");
        System.out.println(names);

        //Arrays.asList 로 만든 리스트는 변경불가 List, 추가, 수정, 삭제 안됨
        //names.remove(0); //에러

        //변경 필요시 List의 구현 클래스의 객체 생성 시 생성자 매개변수로 대입
        List<String> names2 = new ArrayList<>(names);
        names2.remove(0);

        System.out.println(names2);
    }
}
