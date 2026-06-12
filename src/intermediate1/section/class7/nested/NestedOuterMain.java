package intermediate1.section.class7.nested;

import intermediate1.section.class7.nested.NestedOuter.Nested;

public class NestedOuterMain {

    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }

}
