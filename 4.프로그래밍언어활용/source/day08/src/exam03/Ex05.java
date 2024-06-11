package exam03;

public class Ex05 {
    public static void main(String[] args) {
        String str = "I like java and javascript";
        boolean matched = str.matches(".*java.*"); //java 앞 뒤에 뭐 있어도 찾기
        System.out.println(matched);

        String str2 = "     ABC    ";
        String str3 = str2.stripLeading();
        String str4 = str2.stripTrailing();
        System.out.printf("(%s)(%s)%n",str3, str4);
    }
}
