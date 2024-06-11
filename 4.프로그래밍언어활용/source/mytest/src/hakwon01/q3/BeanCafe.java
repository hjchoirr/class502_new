package hakwon01.q3;

import java.util.HashMap;
import java.util.Map;

public class BeanCafe extends AbsCafe {
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

    @Override
    public void order(Person p, String menu) {
        super.order(p, menu);
    }
}
