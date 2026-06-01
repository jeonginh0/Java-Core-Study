package basic.section.class10.ex5.diamond;

//인터페이스 다중 구현
public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();
        System.out.println();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
        System.out.println();
    }

}
