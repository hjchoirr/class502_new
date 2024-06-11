package lambda.func;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Ex01
{
    public static void main(String[] args) {

        String str = "ABC";

        // 소비자 Consummer<T>  받아들여 void accept(T t);
        Consumer<String> c1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        c1.accept(str);

        // 소비자 Consummer<T>  받아들여 void accept(T t);  람다식 예
        Consumer<String> c2 = s -> System.out.println(s);
        //Consumer<String> c2 = System.out::println;
        c2.accept(str);

        //-----------------------------------------------------------

        //공급자 Supplier<T> : 가져와 T get();
        Supplier<String> s1 = new Supplier<String>() {
            @Override
            public String get() {
                return "Good Job!!";
            }
        };
        str = s1.get().toString();
        System.out.println(str);

        //공급자 Supplier<T> : 가져와 T get(); 람다식 예
        Supplier<String> s2 = () -> "Good Job!!";
        str = s2.get().toString();
        System.out.println(str);
    }
}
