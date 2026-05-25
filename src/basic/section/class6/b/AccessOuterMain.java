package basic.section.class6.b;

import basic.section.class6.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public: 호출 가능.
        accessData.publicField = 1;
        accessData.publicMethod();

        // default: a 패키지에 있기 때문에 접근 불가.
        // accessData.defaultField = 2;
        // accessData.defaultMethod();

        // private: 필드와 메서드가 접근조차 되지 않음.
        // accessData.privateField = 3;
        // accessData.privateMethod();

        accessData.innerAccess(); // 여전히 호출해도 문제 없음. (public 이며 내부 호출)
    }

}
