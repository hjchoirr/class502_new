package lambda.func;

import java.util.function.Predicate;

public class Ex03 {
    public static void main(String[] args) {

        String str = "Welcome to my wonderful world!";

        //  Predicate<T>  :  boolean test(T t);
        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //문자열 10글자 이내?
                return s.length() < 10;
            }
        };
        boolean b = p1.test(str);
        System.out.println(b);

        // Predicate<T>  :  boolean test(T t); 람다식
        Predicate<String> p = s -> s.length() < 10;
        b = p.test(str);

        System.out.println(b);

    }
}
