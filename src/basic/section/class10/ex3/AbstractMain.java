package basic.section.class10.ex3;

public class AbstractMain {

    public static void main(String[] args) {
        //추상클래스 생성 불가 - 컴파일 에러
        //AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    // 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 시작");
        System.out.println();
    }

}
