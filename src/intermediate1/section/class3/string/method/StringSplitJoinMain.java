package intermediate1.section.class3.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String s : splitStr) {
            joinStr += s + '-';
        }

        for (int i = 0; i < splitStr.length; i++) {
            String s = splitStr[i];
            joinStr += s;
            if (i != splitStr.length) {
                joinStr += "-";
            }
        }

        //join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열: " + joinedStr);

        //문자열 배열 연경
        String result = String.join("-", splitStr);
        System.out.println("연결된 배열 문자열: " + result);

    }

}
