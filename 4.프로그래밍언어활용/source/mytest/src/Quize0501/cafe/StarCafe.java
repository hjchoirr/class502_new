package Quize0501.cafe;

import java.util.HashMap;
import java.util.Map;

public class StarCafe extends AbstCafe{
    private String name;
    private static Map<String, Integer> menus;


    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 4000);
        menus.put("라떼", 5000);
    }

    public StarCafe() {
        super("별다방", menus);
    }

    @Override
    public void order(Person p, String menu) {
        super.order(p, menu);
    }
}
