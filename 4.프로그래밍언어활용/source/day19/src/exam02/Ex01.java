package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("test1.txt")) {
            while(true){
                int ch = fis.read() ;// 1바이트
                if(ch == -1) break;
                System.out.println((char)ch);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
