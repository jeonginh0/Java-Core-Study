package basic.section.class7.static1;

public class DataCountMain2 {

    /*
    - Data2 클래스와 관련된 일인데, Counter라는 별도의 클래스를 추가로 사용해야 함.
    - 생성자의 매개변수도 추가되고, 생성자가 복잡해짐. 생성자를 호출하는 부분도 복잡해짐.
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }

}
