package Quize0501.cardcompany;

public class ExCardCompany {
    public static void main(String[] args) {
        //CardCompany company = new CardCompany();
        CardCompany company = CardCompany.getInstance();
        Card c1 = company.createCard();
        Card c2 = company.createCard();
        int cardno = c1.getCardNo();
        CardCompany company2 = CardCompany.getInstance();
        System.out.println("카드 발급완료 : " + cardno);
    }
}
