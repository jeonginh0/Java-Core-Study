package basic.section.class10.ex6;

public class Chicken extends AbstractAnimal implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭 날기");
    }
}
