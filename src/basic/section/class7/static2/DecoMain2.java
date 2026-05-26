package basic.section.class7.static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "Hello Java";
//        DecoUtil1 utils = new DecoUtil1(); // 객체 생성을 왜 해야하지? 불편함.
        String deco = DecoUtil2.deco(s); // static 키워드가 붙은 메서드 호출 가능.

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }

}
