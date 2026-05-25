package basic.section.class2.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProductOrderMain4 {

    /**
     * Scanner -> BufferedReader로 리팩터링
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("주문의 개수를 입력하세요. : ");
        int n = Integer.parseInt(br.readLine());

        ProductOrder[] orders =  new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = br.readLine().trim();

            System.out.print("가격: ");
            int price = Integer.parseInt(br.readLine().trim());

            System.out.print("수량: ");
            int quantity = Integer.parseInt(br.readLine().trim());

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " +  order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for(ProductOrder order : orders){
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }

}
