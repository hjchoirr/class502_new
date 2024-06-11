package hakwon03;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr = { 4,5,6,1,2,3,};
        IntStream iStm =  Arrays.stream(arr); // 배열 -> 스트림 기본자료 스트림
        iStm.boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        String[] sArr = {"apple", "orange", "mango", "melon"};
        Stream<String> sStm = Arrays.stream(sArr);  // 배열 -> 스트림 기본자료 스트림
        sStm.forEach(System.out::println);

        List<String> strList = Arrays.asList("apple", "orange", "mango", "melon");
        Stream<String> stm = strList.stream();  // 컬렉션 -> 스트림
        stm.forEach(System.out::println);

        HashSet<String> strSet = new HashSet<>();
        strSet.add("이름1");
        strSet.add("이름2");
        strSet.add("이름2");
        strSet.add("이름3");
        strSet.add("이름4");
        strSet.add("이름5");

        Stream<String> sStm2 = strSet.stream(); // 컬렉션 -> 스트림
        sStm2.forEach(System.out::println);

        Stream<String> sStm3 = Stream.of("apple", "orange", "mango", "melon"); //Stream.of() 정적메서드로 스트림생성
        sStm3.forEach(System.out::println);
    }
}
