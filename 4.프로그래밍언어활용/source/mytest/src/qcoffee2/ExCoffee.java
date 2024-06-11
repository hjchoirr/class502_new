package qcoffee2;

public class ExCoffee {
    public static void main(String[] args) {
        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 10000);

        StarCafe star = new StarCafe();
        BeanCafe bean = new BeanCafe();

        star.order(kim, "아메리카노");
        bean.order(lee, "라떼");

    }
}
