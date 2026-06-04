package intermediate1.section.class3.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] split = fruits.split(",");

        String joinStr = String.join("->", split);
        System.out.println("joinedString = " + joinStr);
    }

}
