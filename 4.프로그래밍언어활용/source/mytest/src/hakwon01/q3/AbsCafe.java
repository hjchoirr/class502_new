package hakwon01.q3;

import java.util.Map;

public abstract class AbsCafe implements Cafe{
    String name; // 카페이름
    Map<String, Integer> menus;

    AbsCafe(String name, Map<String, Integer> menus) {
        this.name = name;
        this.menus = menus;
    }

    @Override
    public void order(Person p, String menu) {
        System.out.printf("%s가 %s에서 %s를 %d원 지불하고 사고 거스름돈 %d원 남았음!%n",
                p.getName(), this.name, menu, menus.getOrDefault(menu, 0),
                p.getMoney() - menus.getOrDefault(menu, 0));
    }
}
