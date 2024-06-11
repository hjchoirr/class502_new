package exam03;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Resources res = new Resources();
        Resources2 res2 = new Resources2();
        try (res; res2){
            // res가 AutoClosable 인터페이스 구현 객체인지 확인 후 close()

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
