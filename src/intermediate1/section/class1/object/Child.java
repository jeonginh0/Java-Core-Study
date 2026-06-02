package intermediate1.section.class1.object;

/*
명시적으로 Parent를 상속했기 떄문에 Object 클래스를 상속받지 않는다.
 */
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }

}
