package Exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ad = new D();
        A ac = new C();

        //C c = (C) ad;  // 에러 : 이렇게 못함

        if(ad instanceof C) {
            System.out.println( "ad 는 C의 인스턴스 ");
            C c = (C) ad;
        }
        if(ac instanceof C) {
            System.out.println("ac는 C의 인스턴스");
            C cc = (C) ac;
            System.out.println("cc.numB: " + cc.numB + "  cc.numC: " + cc.numC);
        }
        if(ac instanceof A) {
            System.out.println("ac는 A의 인스턴스");
        }


    }
}
