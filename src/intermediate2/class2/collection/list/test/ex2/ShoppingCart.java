package intermediate2.class2.collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

/*
자료 구조의 크기가 동적으로 증가한다 (장점)
리스트는 size() 메서드를 통해 입력된 데이터의 크기를 제공
 */
public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 장바구니 상품 출력
     * 상품명: 마늘, 합계: 4000
     * 상품명: 상추, 합계: 12000
     * 전체 가격 합: 16000
     */
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) { // 상품 출력의 목적 루프
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }

        System.out.println("전체 가격 합: " + calculateTotalPrice());

    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
