package quize0501;

public interface CoffeeShop {
    CoffeeShop enter(Person person);
    CoffeeShop order();
    void exit();
    int getTotalSalePrice();
    String getName();

    static void showSaleSummary(CoffeeShop shop) {
        System.out.printf("%s 매출액은 %d %n", shop.getName(), shop.getTotalSalePrice());
    }

}
