package Quize0501.cardcompany;

public class Card {
    private int cardNo;
    private static int serialNo = 10000;


    public Card() {
        serialNo ++;
        cardNo = serialNo;
        System.out.println("새 카드가 발급되었습니다 키드번호: " + cardNo);
    }

    public int getCardNo() {
        return cardNo;
    }
}
