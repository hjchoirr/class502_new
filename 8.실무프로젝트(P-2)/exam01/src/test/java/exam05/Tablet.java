package exam05;

public class Tablet {

    //private Body body = new Body();
    //private TouchScreen touchScreen = new TouchScreen();

    private Body body;
    private TouchScreen touchScreen;


    public Tablet(TouchScreen touchScreen, Body body, Keyboard keyboard) {
        this.touchScreen = touchScreen;
        this.body = body;
    }
    public void run() {

    }
}
