package qcoffee2;

import java.util.HashMap;
import java.util.Map;

public class StarCafe extends AbstCafe{

    private String name;
    private static Map<String, Integer> menus;
    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 4000);
        menus.put("라떼", 6000);
    }

    public StarCafe() {
        super("별다방", menus);
    }
}
