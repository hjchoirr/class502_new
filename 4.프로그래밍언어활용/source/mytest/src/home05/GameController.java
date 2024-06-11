package home05;

public class GameController {
    private GameService service;
    private GameView view;

    public GameController(GameService service, GameView view) {
        this.service = service;
        this.view = view;
    }

    public void play() {
        while (true) {
            int userGuess = view.getUserInput();
            if (service.isGuessCorrect(userGuess)) {
                view.displayResult(true);
                break;
            } else {
                view.displayResult(false);
                view.displayHint(service.provideHint(userGuess));
            }
        }
    }
}
