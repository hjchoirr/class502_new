package home05;

import java.util.Scanner;

public class GameView {
    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 10까지의 숫자 중 하나를 입력하세요: ");
        return scanner.nextInt();
    }

    public void displayResult(boolean isCorrect) {
        if (isCorrect) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("틀렸습니다. 다시 시도하세요.");
        }
    }

    public void displayHint(String hint) {
        System.out.println(hint);
    }
}
