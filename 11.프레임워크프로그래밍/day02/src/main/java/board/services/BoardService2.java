package board.services;

//가정 - 외부 서비스 제공 받은 클래스이고 변경 불가한 클래스라고 가정
public class BoardService2 {
    public void init() {
        System.out.println("BoardService2 - init()!");
    }

    public void destroy() {
        System.out.println("BoardService2 - destroy()!");
    }
}
