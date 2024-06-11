package exam02;

public class A {
    public int numA;
    int numAA; //default 접근제어자, 동일패키지에서만 사용 가능
    int numAAA;
    protected int numB;

    void printNum() {
        numAAA = 100;
        System.out.println(numAAA);
    }
    
}
