package exam02;

public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        sb.append("ABC");
        System.out.printf("sb의 주소 : %d%n", System.identityHashCode(sb));
        sb.append("CDF");
        System.out.printf("sb의 주소 : %d%n", System.identityHashCode(sb));

        String str = sb.toString();
        System.out.printf("str의 주소 : %d%n", System.identityHashCode(str));
    }
}
