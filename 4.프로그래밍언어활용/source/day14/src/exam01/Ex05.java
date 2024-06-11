package exam01;

import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length();
        //int len = func1.apply("가나다");
        //System.out.println(len);

        Function<Integer,Integer> func2 = x -> x * x;
        Function<String, Integer> func3 = func1.andThen(func2);
        int num = func3.apply("가나다");
        System.out.println(num);

        Function<String, Integer> func4 = func2.compose(func1);
        num = func4.apply("가나다");
        System.out.println(num);


    }
}
