package intermediate1.section.class5.ref3;

public enum Grade {
    //아래 선언한 생성자를 이용해서 즉시 생성자 선택이 가능하다.
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40); //다른 로직이 들어오면 ;(세미콜론)을 써줘야 함.

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
