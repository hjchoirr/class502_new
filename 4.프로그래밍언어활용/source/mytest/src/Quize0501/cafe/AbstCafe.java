package Quize0501.cafe;

import java.util.Map;

public abstract class AbstCafe implements Cafe{
    String name; //카페이름
    Map<String, Integer> menus;

    AbstCafe(String name, Map<String, Integer> menus) {
        this.name = name;
        this.menus = menus;
    }

    @Override
    public void order(Person p, String menu) {
        System.out.printf("%s가 %s에서 %s를 %d원 지불하고 샀다!%n",
                p.getName(), this.name, menu, menus.getOrDefault(menu, 0));
    }
}
