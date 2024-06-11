package exam01;

public class Ex05 {
    public static void main(String[] args) {
        String tran1 = "BUS";

        Transportation BUS = Transportation.valueOf(tran1);
        //Transportation BUS = Enum.valueOf(Transportation.class, tran1); //윗줄과 동일, 윗줄이 더 간단

        System.out.println(BUS.name());
    }
}
