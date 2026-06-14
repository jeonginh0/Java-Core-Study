package intermediate2.class1.generic.test.ex4;

import intermediate2.class1.generic.animal.Cat;
import intermediate2.class1.generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog); //Generic 안넣어도 타입 추론 <Dog> 생략
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog biggerDog = AnimalMethod.bigger(dog, targetDog);
        System.out.println("biggerDog = " + biggerDog);
    }

}
