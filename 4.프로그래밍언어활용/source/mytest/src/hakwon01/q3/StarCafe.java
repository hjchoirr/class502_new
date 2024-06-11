package hakwon01.q3;

import java.util.HashMap;
import java.util.Map;

public class StarCafe extends AbsCafe{

    private String name;
    private static Map<String, Integer> menus;
    static { //클래스 로드되는 순간 실행되는 부분 정의
        menus = new HashMap<>();
        menus.put("아메리카노", 4000);
        menus.put("라떼", 5500);
    }

    public StarCafe() {
        super("별다방", menus);
    }

    @Override
    public void order(Person p, String menu) {
        super.order(p, menu);
    }
}
