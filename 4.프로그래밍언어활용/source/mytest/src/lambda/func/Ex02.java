package lambda.func;

import java.util.function.Function;

public class Ex02 {
    public static void main(String[] args) {

        String str = "Hello Java!!";

        // Function<T, R> :  R apply(T t);
        Function<String, Integer> f2 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        int len = f2.apply(str);
        System.out.println(len);

        Function<String,Integer> f = a -> a.length();
        //Function<String, Integer> f = String::length;
        len = f.apply(str);
        System.out.println(len);

    }
}
