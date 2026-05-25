package basic.section.class5.com.helloshop.order;

import basic.section.class5.com.helloshop.product.Product;
import basic.section.class5.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
