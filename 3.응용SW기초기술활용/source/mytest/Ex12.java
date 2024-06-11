package exam01;

public class Ex12 {
    public static void main(String[] args) {
        int rid = 0;
        for (int sid = 1; sid <= 40; sid ++) {
            System.out.printf("학생%d, 방번호 %d\n", sid, (sid % 10) == 0 ? 10 : (sid % 10));
        }
    }
}
