package home05;

public class NumberGuessingGame {
    public static void main(String[] args) {
        GameModel model = new GameModel();
        GameService service = new GameService(model);
        GameView view = new GameView();
        GameController controller = new GameController(service, view);

        controller.play();
    }
}
