package basic.section.class6.a;

public class PublicClass {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // 외부에서 접근 가능.
        DefaultClass1 class1 = new DefaultClass1(); // 같은 패키지 내에서만 접근 가능
        DefaultClass2 class2 = new DefaultClass2(); // 같은 패키지 내에서만 접근 가능
    }

}

class DefaultClass1 {}

class DefaultClass2 {}
