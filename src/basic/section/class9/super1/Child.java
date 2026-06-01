package basic.section.class9.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this 생략 가능(자기자신)
        System.out.println("super value = " + super.value); // super 부모 타입에서 찾아오기

        this.hello(); // this 생략 가능
        super.hello();
    }

}
