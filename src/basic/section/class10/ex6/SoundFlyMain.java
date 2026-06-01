package basic.section.class10.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        moveFlyAnimal(bird);
        moveFlyAnimal(chicken);
    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 시작");
        System.out.println();
    }

    // 변하지 않는 부분
    private static void moveFlyAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.fly();
        System.out.println("동물 이동 테스트 시작");
        System.out.println();
    }

}
