package intermediate2.class1.generic.ex3;

import intermediate2.class1.generic.animal.Cat;
import intermediate2.class1.generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<>(); //컴파일 오류 발생

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1: 개 병원에 고양이 전달 (해결)
        // dogHospital.set(cat); //다른 타입을 입력하기 때문에 컴파일 오류 발생

        //문제2: 개 타입 반환 (해결), 캐스팅 필요 없음.
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }

}
