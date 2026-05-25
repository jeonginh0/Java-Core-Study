package basic.section.class6.b;

// import basic.section.class6.a.DefaultClass1; // 다른 패키지라서 접근 불가
// import basic.section.class6.a.DefaultClass2; // 다른 패키지라서 접근 불가
import basic.section.class6.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // DefaultClass1 defaultClass1 = new DefaultClass1(); // 다른 패키지라서 접근 불가
        // DefaultClass2 defaultClass2 = new DefaultClass2(); // 다른 패키지라서 접근 불가
    }

}
