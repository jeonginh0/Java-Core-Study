package intermediate1.section.class3.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        //불변이 아니라서 바로 사용가능한 값임.
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String 가변에서 불변으로 마무리 할 수 있음.
        String string = sb.toString();
        System.out.println("string = " + string);
    }

}
