package org.choongang.main;

import java.util.Scanner;

public abstract class AbstractGame implements Game{

    @Override
    public int getInput() {
        int p = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.equals("q") || str.equals("quit") || str.equals("exit")) {
            System.exit(0); // 0 : 정상종료, 1: 비정상종료
        }
        try {
            p = Integer.parseInt(str);  // 숫자 아니면 예외로
        } catch (Exception e) {

        }
        return p;
    }
}
