package basic.section.class9.super2;

public class ClassC extends ClassB {
    public ClassC() {
        // super(); // 부모 클래스에서 생성자를 직접 정의했기에 기본 생성자를 호출할 수 없다. super()를 직접해야 함.
        super(1, 20);
        System.out.println("ClassC 생성자");
    }
}
