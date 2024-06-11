package hakwon01.q3;


public class ExCafe {
    public static void main(String[] args) {
        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 10000);

        StarCafe sCafe = new StarCafe();
        BeanCafe bCafe = new BeanCafe();

        sCafe.order(kim, "아메리카노");
        bCafe.order(lee, "라떼");

    }

}
