package org.choongang.main;

import lombok.Data;

@Data
public class PlayGame {

    private String gameMode; // 가위바위보 또는 묵찌빠
    private int winGame = 0;       // 플레이어의 게임결과 1:승 0:무 -1:패
    private int rps1;  // 수비자 낸 값 (1.가위 2.바위 3.보)
    private int rps2;  // 공격자 낸 값 (1.찌 2.묵 3.빠)


    //반환값 0 공격자 승패에 따라 : 무, 1: 승, -1: 패
    int decideWin() {
        switch(rps1) {
            case 1 :
                switch (rps2) {
                    case 1: winGame = 0; break;
                    case 2: winGame = 1; break;
                    case 3: winGame = -1; break;
                }
                break;
            case 2 :
                switch (rps2) {
                    case 1: winGame = -1; break;
                    case 2: winGame = 0; break;
                    case 3: winGame = 1; break;
                }
                break;
            case 3:
                switch (rps2) {
                    case 1: winGame = 1; break;
                    case 2: winGame = -1; break;
                    case 3: winGame = 0; break;
                }
                break;
        }
        return winGame;
    }

    String rpsString(int m, String mod) {
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
