package basic.section.class10.basic;

//upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 생략이 가능하며 생략을 권장한다.
        Parent parent2 = child; //생략

        parent1.parentMethod();
        parent2.parentMethod();
    }

}
