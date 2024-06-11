package qcoffee;

public class ExCoffee {
    public static void main(String[] args) {
        Person kim = new Person("김씨", 4500);
        Person lee = new Person("이씨", 5000);

        StarBucks sCoffee = new StarBucks();
        kim.buyStarCoffee(sCoffee, "아메리카노");

        CoffeeBean bCoffee = new CoffeeBean();
        lee.buyBeanCoffee(bCoffee, "라떼");


    }
}
