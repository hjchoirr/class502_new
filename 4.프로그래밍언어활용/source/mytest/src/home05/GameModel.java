package home05;

public class GameModel {
    private int targetNumber;

    public GameModel() {
        this.targetNumber = (int) (Math.random() * 10) + 1;
    }

    public int getTargetNumber() {
        return targetNumber;
    }
}
