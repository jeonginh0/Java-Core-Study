package basic.section.class10.ex6;

public class Bird extends AbstractAnimal implements InterfaceAnimal {
    
    @Override
    public void sound() {
        System.out.println("쨱짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
