package exam01;
public class Ex08 {
    public static void main(String[] args) {
        Transportation BUS = Transportation.BUS;
        int fare = BUS.getFare();
        System.out.println(fare);
        int tot = BUS.getTotal(20);
        System.out.println(tot);
    }
}
