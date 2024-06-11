package org.choongang.main;

public class RockGame extends AbstractGame{
    int rps1;
    int rps2;
    int winGame;
    @Override

    public int playProcess() {
        //반환값 0 공격자 승패에 따라 : 무, 1: 승, -1: 패
            switch (rps1) {
                case 1:
                    switch (rps2) {
                        case 1:
                            winGame = 0;
                            break;
                        case 2:
                            winGame = 1;
                            break;
                        case 3:
                            winGame = -1;
                            break;
                    }
                    break;
                case 2:
                    switch (rps2) {
                        case 1:
                            winGame = -1;
                            break;
                        case 2:
                            winGame = 0;
                            break;
                        case 3:
                            winGame = 1;
                            break;
                    }
                    break;
                case 3:
                    switch (rps2) {
                        case 1:
                            winGame = 1;
                            break;
                        case 2:
                            winGame = -1;
                            break;
                        case 3:
                            winGame = 0;
                            break;
                    }
                    break;
            }
            return winGame;
        }

    @Override
    public int postProcess() {
        return 0;
    }
}
