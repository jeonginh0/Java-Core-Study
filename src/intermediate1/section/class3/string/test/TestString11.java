package intermediate1.section.class3.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder sb = new StringBuilder();
        String reverseStr = sb.append(str).reverse().toString();
        System.out.println(reverseStr);
    }

}
