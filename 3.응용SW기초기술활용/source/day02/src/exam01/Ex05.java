package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int tot = 0, num = 1;
        while( num <= 100) {
            tot += num;
            num++;
        }
        System.out.println("합계: " + tot);
        System.out.println(num);
    }
}
