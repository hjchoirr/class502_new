package home05;

public class GameService {
    private GameModel model;

    public GameService(GameModel model) {
        this.model = model;
    }

    public boolean isGuessCorrect(int guess) {
        return guess == model.getTargetNumber();
    }

    public String provideHint(int guess) {
        if (guess > model.getTargetNumber()) {
            return "더 낮은 숫자를 시도해보세요!";
        } else {
            return "더 높은 숫자를 시도해보세요!";
        }
    }
}
