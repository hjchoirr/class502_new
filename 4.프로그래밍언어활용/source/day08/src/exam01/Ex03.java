package exam01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));
        int tot = 0;
        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            tot += num;
        }
        System.out.println(tot);
    }
}
