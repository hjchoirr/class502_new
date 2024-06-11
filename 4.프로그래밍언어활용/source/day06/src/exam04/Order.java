package exam04;

public class Order implements Seller, Buyer {
    @Override
    public void buy() {
        System.out.println("구매");
    }
    @Override
    public void sell() {
        System.out.println("판매");
    }
    public void order() {
        Buyer.super.order();   // Buyer, Seller 중 어떤 order인지 명확히 하기
    }
}
