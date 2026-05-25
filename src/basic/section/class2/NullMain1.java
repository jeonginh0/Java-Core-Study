package basic.section.class2;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data); // 나 다시 주소지 뺄거임

        /**
         * data에 null을 할당했을 때 앞서 생성한 x001 인스턴스를 더는 아무도 참조하지 않는다.
         * 아무도 참조하지 않는 인스턴스가 있으면 JVM의 GC(가비지 컬렉션)가 더 이상 참조하지 않는 인스턴스라 판단하고 해당 인스턴스를
         * 메모리에서 제거해준다.
         */
    }

}
