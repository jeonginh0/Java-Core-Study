package intermediate1.section.class3.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String original = "     Hello Java   ";
        //String trim = original.trim();
        String strip = original.strip();
        System.out.println("trim = " + strip);
    }

}
