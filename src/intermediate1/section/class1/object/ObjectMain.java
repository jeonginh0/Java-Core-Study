package intermediate1.section.class1.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        Child child1 = child;
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString(); // 객체의 정보 제공
        boolean equals = child.equals(child1); // 객체의 같음을 비교
        Class<? extends Child> aClass = child.getClass(); // 객체의 클래스 정보 제공
        System.out.println(string);
        System.out.println(equals);
        System.out.println(aClass);
    }

}
