package intermediate1.section.class3.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        // StringBuilder의 메서드 체이닝
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
            .insert(4, "Java")
            .delete(4, 8)
            .reverse()
            .toString();

        System.out.println("string = " + string);
    }

}
