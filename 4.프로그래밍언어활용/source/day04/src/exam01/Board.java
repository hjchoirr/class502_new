package exam01;

public class Board {
    //private static Board instance = new Board();  //클래스 로드 시점 부터 객체 생성, 메모리 차지하므로 아랫줄처럼 선언만
    private static Board instance;

    static { // 스태틱 블럭
        System.out.println("처음부터 실행, 객체 생성과 관련없이..");
    }
    private Board() { }

    public static Board getInstance() {
        if(instance == null) {
            instance = new Board();  // 필요한 시점에 1번만 객체 생성
        }
        return instance;
    }
}
