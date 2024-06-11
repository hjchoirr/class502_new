package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        s1.showDate();

        s1.printThis();
        System.out.println(s1);
        Schedule _this = s1.returnThis();
        System.out.println(_this == s1);
        System.out.println(_this.getDay());
    }
}
