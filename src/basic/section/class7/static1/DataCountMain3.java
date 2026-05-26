package basic.section.class7.static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        /*
        static이 붙은 정적 변수에 접근하려면 클래스명.(dot)로 접근하면 됨.
         */
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("A count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("A count = " + Data3.count);
    }

}
