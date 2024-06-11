package quize0501;

public class Person {
    private String name;  // 사람이름
    private int money; // 가진돈
    private String menu;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public String getMenu() {
        return menu;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String toString() {
        return String.format("%s님의 남은 금액은 %d원 입니다%n", name, money);
    }

    public static void showSaleSummary(CoffeeShop shop) {

    }
}
