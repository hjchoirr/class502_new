package exam01;
import java.io.File;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/fstudy/sub1/sub2/sub3/test1.txt");
        String absPath = file.getAbsolutePath();
        System.out.println(absPath);

        File file2 = new File("D:/fstudy/sub1/sub2/../sub2/sub3/test1.txt");
        String absPath2 = file2.getAbsolutePath();
        System.out.println(absPath2);

        String canonPath = file2.getCanonicalPath();
        System.out.println(canonPath);

        System.out.println("getName() : " + file.getName());
        System.out.println("getPath() : " + file.getPath());
    }
}
