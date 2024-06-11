package qcoffee;

public class Person {
    String name;
    int money;

    Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarBucks sCoffee, String menu) {
        sCoffee.order(menu, this.name, this.money);
    }

    public void buyBeanCoffee(CoffeeBean bCoffee, String menu){
        bCoffee.order(menu, this.name, this.money);
    }
}
