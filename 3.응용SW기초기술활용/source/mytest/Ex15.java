package exam01;

public class Ex15 {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i ++) {
            for(int j = 2; j <= 9; j ++ ) {
                if(i <= j) {
                    System.out.printf("%d X %d = %d\n", i, j, i * j);
                }
            }
        }
    }
}
