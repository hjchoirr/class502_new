package qcoffee2;

import java.util.HashMap;
import java.util.Map;

public class BeanCafe extends AbstCafe{
    private String name;
    private static Map<String, Integer> menus;
    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 3500);
        menus.put("라떼", 4500);
    }

    public BeanCafe() {
        super("콩다방", menus);
    }
}
