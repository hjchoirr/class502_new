package quize0501;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBean extends AbstractCoffeeShop{
    private static Map<String, Integer> menus;

    static {
        menus = new HashMap<>();
        menus. put("아메리카노", 3000);
        menus. put("라떼", 3500);
    }

    public CoffeeBean() {
        super("커피빈", menus);
    }

}
