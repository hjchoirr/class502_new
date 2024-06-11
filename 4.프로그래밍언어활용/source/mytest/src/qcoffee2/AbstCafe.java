package qcoffee2;
import java.util.Map;

public abstract class AbstCafe implements Cafe {
    private String name;
    private Map<String, Integer> menus;

    AbstCafe(String name, Map<String, Integer> menus) {
        this.name = name;
        this.menus = menus;
    }

    @Override
    public void order(Person p, String menu) {
        System.out.printf("%s가 %s에서 %s 주문 %d원%n",
                p.name, name, menu, menus.getOrDefault(menu, 0) );
    }
}
