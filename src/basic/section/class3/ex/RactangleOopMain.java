package basic.section.class3.ex;

public class RactangleOopMain {

    public static void main(String[] args) {

        // 원래 코드
        // Ractangle ractangle = new Ractangle();
        // ractangle.width = 5;
        // ractangle.height = 8;

        // 생성자 활용
        Ractangle ractangle = new Ractangle(5, 8);

        System.out.println("넓이: " + ractangle.calculateArea());
        System.out.println("둘레 길이: " + ractangle.calculatePerimeter());
        System.out.println("정사각형 여부: " + ractangle.isSquare());
    }

}
