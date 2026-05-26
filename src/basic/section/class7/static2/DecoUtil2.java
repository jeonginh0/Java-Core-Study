package basic.section.class7.static2;

public class DecoUtil2 {
    // 메서드 반환 타입 앞에 static.
    // 정적 메서드 or 클래스 메서드 라고 부름.
    static public String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
