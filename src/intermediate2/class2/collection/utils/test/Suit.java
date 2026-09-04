package intermediate2.class2.collection.utils.test;

public enum Suit {
    SPADE("♠"), // 스페이드
    HEART("♥"), // 하트
    DIAMOND("♦"), // 다이아몬드
    CLOVER("♣"); //클로버

    public String getIcon() {
        return icon;
    }

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }
}
