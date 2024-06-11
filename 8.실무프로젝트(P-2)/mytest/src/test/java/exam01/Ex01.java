package exam01;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Ex01 {
    @Test
    void test1() {
        String mod = "가위바위보";
        int win = 0;
        boolean isAttack = true; //플레이어가 공격자로 시작

        while(true) {
            System.out.println(mod + "------------------------");
            if(mod.equals("가위바위보")) {
                System.out.print("(1)가위 (2)바위 (3)보 (q)종료 : ");
            }else {
                System.out.print("(2)묵 (1)찌 (3)빠 : ");
            }

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals("q") || str.equals("quit") || str.equals("exit")) {
                System.exit(0); // 0 : 정상종료, 1: 비정상종료
            }
            try {
                int p = Integer.parseInt(str);  // 숫자 아니면 예외로
                int x = (int)(Math.random() * 3 + 1); //시스템
                x = 1;
                String xStr = rpsString(x, mod);
                String pStr = rpsString(p, mod);

                System.out.print("시스템:" + xStr + "  플레이어:" + pStr + "\n");
                if(isAttack) {
                    System.out.print("공격중-----");
                    win = decideWin(x, p); //수비자, 공격자
                } else {
                    System.out.print("수비중-----");
                    win = decideWin(p, x); //수비자, 공격자
                }
                System.out.println("win :" + win);
                System.out.println("mod :" + mod);
                if(mod == "가위바위보") {
                    if (win == 1) {
                        System.out.println(" [승] -> 공격시작..");
                        mod = "묵찌빠";
                        isAttack = true;

                    } else if (win == -1) {
                        System.out.println(" [패] -> 수비시작..");
                        mod = "묵찌빠";
                        isAttack = false;
                    } else {
                        System.out.println(" [무] -> 다시 ..");
                    }
                } else {  //묵찌빠 모드 mod : "묵찌빠"
                    if (win == 1) {
                        System.out.println(" [승] -> 공격시작..");
                        mod = "묵찌빠";
                        isAttack = true;

                    } else if (win == -1) {
                        System.out.println(" [패] -> 수비시작..");
                        mod = "묵찌빠";
                        isAttack = false;
                    } else {
                        System.out.println(" [무] -> 묵찌빠 승부 : " + (isAttack ? "이겼습니다" : "졌습니다"));
                        mod = "가위바위보";
                        isAttack = true;

                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                if(mod == "가위바위보") {
                    System.out.println("가위(1) 바위(2) 보(3)는 숫자로 입력하세요.");
                } else {
                    System.out.println("찌(1) 묵(2) 빠(3)는 숫자로 입력하세요.");
                }
            }
        }

    }
    // rps1 수비자,  rps2 공격자
    public int decideWin(int rps1, int rps2) {
        // 0 : 무승부, 1: 공격자 승, -1: 공격자 패
        int win = 0;
        switch(rps1) {
            case 1 :
                switch (rps2) {
                    case 1: win = 0; break;
                    case 2: win = 1; break;
                    case 3: win = -1; break;
                }
                break;
            case 2 :
                switch (rps2) {
                    case 1: win = -1; break;
                    case 2: win = 0; break;
                    case 3: win = 1; break;
                }
                break;
            case 3:
                switch (rps2) {
                    case 1: win = 1; break;
                    case 2: win = -1; break;
                    case 3: win = 0; break;
                }
                break;
        }
        System.out.println("return win :" + win);
        return win;
    }
    static String rpsString(int m, String mod) {
        String str = null;
        if(mod == "가위바위보") {

            switch (m) {
                case 1:
                    str = "가위";
                    break;
                case 2:
                    str = "바위";
                    break;
                case 3:
                    str = "보";
                    break;
            }
        } else {  //묵찌빠
            switch (m) {
                case 1:
                    str = "찌";
                    break;
                case 2:
                    str = "묵";
                    break;
                case 3:
                    str = "빠";
                    break;
            }
        }
        return str;
    }

}
