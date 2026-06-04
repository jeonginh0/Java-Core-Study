package intermediate1.section.class3.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002

        System.out.println("new String() == 비교: " + (str1 == str2)); //다른 인스턴스이기 떄문 참조값이 다름.
        System.out.println("new String() equals 비교: " + str1.equals(str2)); //String 객체 안의 value값으로 비교함.

        String str3 = "hello"; //x003
        String str4 = "hello"; //똑같은 hello가 있네? 하면 안만듦
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + str3.equals(str4));

        /*
        문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
        자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어둔다. 이때 같은 문자열이 있으면 만들지 않는다.
         */
    }
}
