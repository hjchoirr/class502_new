package exam06;

public class AssemCom {
    public Body body() {
        return new Body();
    }
    public Monitor monitor() {
        return new Monitor();
    }

    public Desktop desktop() {
        return new Desktop(body(), monitor());
    }
}
