package basic.section.class9.ex.item;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름: " + name + ", price: " + price);
    }

    public int getPrice() {
        return price;
    }

}
