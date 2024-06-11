package hakwon01.q5;

public class Card {
    private int cardNo;
    private static int serialNo = 10000;

    public Card() {
        serialNo++;
        cardNo = serialNo;
        System.out.println("새 카드가 발급되었습니다. 카드번호 : " + cardNo);

    }
    public int getCardNo() {
        return cardNo;
    }
}
