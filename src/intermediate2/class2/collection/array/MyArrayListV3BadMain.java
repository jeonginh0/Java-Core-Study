package intermediate2.class2.collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        //숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3"); //문자를 입력
        System.out.println(numberList);

        //Object를 반환하기 때문에 다운 캐스팅이 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        //ClassCaseException 발생, 문자를 Integer로 캐스팅 했기 때문
        //Integer num3 = (Integer) numberList.get(2); //예외 발생 String이 나오기 때문
    }

}
