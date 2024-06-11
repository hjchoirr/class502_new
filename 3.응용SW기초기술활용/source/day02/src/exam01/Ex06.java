package exam01;

public class Ex06 {
    public static void main(String[] args) {
        int tot = 0, tot2 = 0;
        int i = 0, j = 0;
        for(; ; i++, j += 2) {
            if(i > 100) {
                break;
            }
            tot += i;
            tot2 += j;
        }
        System.out.println("합계 tot :" + tot);
        System.out.println("합계 tot2:" + tot2);
    }
}
