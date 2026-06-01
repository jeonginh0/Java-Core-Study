package basic.section.class9.access.child;

import basic.section.class9.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지
        //defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류 발생
        //privateValue = 1; // 외부에서 접근 불가, 컴파일 오류 발생

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지
        //defaultMethod(); // 다른 패키지 접근 불가, 컴파일 오류 발생
        //privateMethod(); // 외부에서 접근 불가, 컴파일 오류 발생

        printParent(); // 가능. Parent 자기 자신의 메서드이기 때문에 호출 가능.
    }

}
