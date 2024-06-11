package exam05;

public class ComputerAssembler {
    public Monitor monitor() {
        return new UpgradedMonitor();
    }

    public Body body() {
        return new Body();
    }

    public Keyboard keyboard() {
        return new Keyboard();
    }

    public TouchScreen touchScreen() {
        return new TouchScreen();
    }

    public Desktop desktop() {
        return new Desktop(monitor(), body(), keyboard());
    }

    public Tablet tablet() {
        return new Tablet(touchScreen(), body(), keyboard());
    }
}
