package hakwon03;

public class A {
    private String memA = "A";


    public void paint() {
        System.out.println("A paint");

    }
    public void draw() {
        System.out.println("A draw");
        this.draw();
    }

    public String getMemA() {
        return memA;
    }

    public void setMemA(String memA) {
        this.memA = memA;
    }
}
