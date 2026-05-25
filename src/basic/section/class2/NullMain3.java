package basic.section.class2;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigdata = new BigData();
        System.out.println("bigData.count = " + bigdata.count); // null (초기값)
        System.out.println("bigData.data = " + bigdata.data); // 0 (초기값)

        // NullPointerException 발생!
        System.out.println("bigData.data.value = " + bigdata.data.value);
    }

}
