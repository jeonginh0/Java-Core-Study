package intermediate1.section.class3.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello"; //x001
        String b = " java"; //x002

        String result1 = a.concat(b);
        String result2 = a + b; //자바상에서 편의상 제공하는 문법
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
