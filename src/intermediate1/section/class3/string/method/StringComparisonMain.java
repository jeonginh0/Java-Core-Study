package intermediate1.section.class3.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {

        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; //대문자 일부 있음
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); //a와 b는 사전적으로 한 칸차이
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a")); //a와 c는 사전적으로 두 칸차이
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 startWith 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 endsWith 'Java!': " + str1.endsWith("Java!"));
    }

}
