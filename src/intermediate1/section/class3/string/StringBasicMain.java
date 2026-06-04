package intermediate1.section.class3.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");  //String은 클래스다. 즉, 참조형. 문자열 리터럴이 일어남. 자바가 편의성을 봐줌.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
