package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex05 {
    public static void main(String[] args) {
        String[] names = {"이름1", "이름2","이름3","이름4","이름5","이름3"};

        List<String> namesList = Arrays.stream(names).collect(Collectors.toList());
        System.out.println(namesList);

        List<String> namesList2 = Arrays.stream(names).toList();
        System.out.println(namesList2);

        Set<String> namesSet = Arrays.stream(names).collect(Collectors.toSet());
        System.out.println(namesSet);
    }
}
