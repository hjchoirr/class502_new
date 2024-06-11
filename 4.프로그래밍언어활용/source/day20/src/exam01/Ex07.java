package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {

        long stime = System.currentTimeMillis(); //작업시작시간

        try(FileInputStream fis = new FileInputStream("specs.zip");
            FileOutputStream fos = new FileOutputStream("specs_copied.zip")) {
            while(fis.available() > 0) {
                fos.write(fis.read()); // 1바이트씩 읽고 쓰기
            }
        }catch(IOException e) {
            e.printStackTrace();
        }

        long etime = System.currentTimeMillis();
        System.out.printf("걸린시간: %d%n", etime - stime);
    }
}
