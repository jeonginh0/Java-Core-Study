package basic.section.class6.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public: 호출 가능.
        accessData.publicField = 1;
        accessData.publicMethod();

        // default: 현재 같은 패키지 내에 있기에 접근 가능.
        accessData.defaultField = 2;
        accessData.defaultMethod();

        // private: 필드와 메서드가 접근조차 되지 않음.
        // accessData.privateField = 3;
        // accessData.privateMethod();

        accessData.innerAccess(); // 이 메서드는 내부적으로 호출되는 메서드이기 때문에 private 필드, 메서드에 접근이 가능.
    }

}
