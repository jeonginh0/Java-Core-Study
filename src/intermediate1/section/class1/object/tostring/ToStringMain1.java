package intermediate1.section.class1.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object o = new Object();
        String string = o.toString();

        //toString() 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(o);
    }

}
