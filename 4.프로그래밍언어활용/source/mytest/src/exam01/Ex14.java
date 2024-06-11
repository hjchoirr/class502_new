package exam01;

public class Ex14 {
    public static void main(String[] args) {
        for(int i =3; i <= 9; i += 2) {
            System.out.println(i + "단------");
            for( int j = 2; j <= 9; j ++ ) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
        }
        System.out.println("===========또는=============");

        for(int i =2; i <= 9; i++) {
            if(i % 2 == 0) continue;
            System.out.println(i + "단------");
            for( int j = 2; j <= 9; j ++ ) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
        }
    }
}
