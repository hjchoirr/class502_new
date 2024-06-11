package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Transportation trans = Transportation.TAXI;
        String str = trans.name();  // => trans.toString();
        System.out.println(str);

        int ordinal = trans.ordinal();
        System.out.println(ordinal);
    }
}
