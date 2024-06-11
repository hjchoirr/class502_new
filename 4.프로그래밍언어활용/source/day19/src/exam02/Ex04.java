package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")) {
            byte[] buffer = new byte[5];
            while(fis.available() > 0) {
                int ch = fis.read(buffer);  // ch : 읽은 바이트 수
                for(int i = 0; i < ch; i++) {   // 읽은 바이트 수 만큼만 돌기
                    System.out.print((char)buffer[i]);
                }
                System.out.println();
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
