package intermediate1.section.class3.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java"); // 새로운 반환값이 있음. 기존값을 변경하지는 않음.
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

}
