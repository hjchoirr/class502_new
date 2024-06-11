package qcoffee;

import java.util.Map;

public abstract class  AbsCoffeeShop implements CoffeeShop{

    private String name;
    private Map<String, Integer> menus;

    public AbsCoffeeShop(String name, Map<String, Integer> menus) {
        this.name = name;
        this.menus = menus;
    }

    @Override
    public CoffeeShop order(String menu, String pname, int pmoney) {
        System.out.printf("%s님이 %s에서 %s 를 %d 지불하고 주문! 거스름돈 %d %n", pname, this.name, menu, this.menus.getOrDefault(menu, 0), pmoney - menus.getOrDefault(menu, 0)  );
        return this;
    }
}
