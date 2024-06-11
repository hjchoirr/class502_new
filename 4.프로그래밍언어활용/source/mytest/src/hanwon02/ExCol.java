package hanwon02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExCol {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Collections.addAll(names,"aaa","bbb","ccc");
        System.out.println(names);

        System.out.println(Collections.addAll(names,"a", "b", "c"));
        System.out.println(names);
    }
}
