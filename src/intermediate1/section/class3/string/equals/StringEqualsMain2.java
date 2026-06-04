package intermediate1.section.class3.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        //return x == y; // 문자열 리터럴이 적용된 상황과 그렇지 않은 상황의 리턴값이 달라질 수 있음.
        return x.equals(y);
    }

}
