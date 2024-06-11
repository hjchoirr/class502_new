package qcoffee;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBean extends AbsCoffeeShop{
    private static Map<String, Integer> menus;
    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 3000);
        menus.put("라떼", 5000);
    }
    public CoffeeBean() {
        super("커피빈",menus);
    }
}
