package basic.section.class2;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigdata = new BigData();
        bigdata.data = new Data(); // 참조값 초기화.

        System.out.println("bigData.count = " + bigdata.count); // 제대로 나옴
        System.out.println("bigData.data = " + bigdata.data); // 0 (초기값)

        // NullPointerException 발생하지 않음
        System.out.println("bigData.data.value = " + bigdata.data.value);
    }

}
