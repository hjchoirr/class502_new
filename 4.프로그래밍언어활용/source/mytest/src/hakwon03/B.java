package hakwon03;

public class B extends A{
    public void paint() {
        System.out.println("B paint");
        //draw();
        super.draw();
    }

    public void draw() {
        System.out.println("B draw");
    }
}
