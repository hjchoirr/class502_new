package org.choongang;

import java.util.function.Consumer;

public class ExConsumer {
    public static void main(String[] args) {
        Consumer<String> handler = (s) -> System.out.println(s);
        handler.accept("가나다라마바");
        handler.accept("가나다라마바2");

        Consumer consumer2 = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        } ;
    }


}
