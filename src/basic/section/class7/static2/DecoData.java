package basic.section.class7.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근, Compile Error
        //instanceMethod(); // 인스턴스 메서드 접근, Compile Error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        /*
        인스턴스 메서드(static이 붙지 않은) 내에서는 정적변수, 인스턴스 변수, 메서드 등에 접근 가능.
         */
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
