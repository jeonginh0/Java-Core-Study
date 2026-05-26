package basic.section.class7.static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        /*
        static이 붙은 정적 변수에 접근하려면 클래스명.(dot)로 접근하면 됨.
         */
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count); // 정적 변수에 접근하면 메서드 영역에 들어 있는 변수를 쓴다.
        // 위 코드는 추천하지 않음.
    }

}
