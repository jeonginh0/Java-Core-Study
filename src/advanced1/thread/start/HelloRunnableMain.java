package advanced1.thread.start;

public class HelloRunnableMain {

    public static void main(String[] args) {
        /*
        Thread 클래스 상속 방식 보다 Runnable 인터페이스 구현 방식을 실무에서 더 많이 사용한다.
        장점
            - 상속의 자유로움 Runnable 인터페이스 방식은 다른 클래스를 상속받아도 문제없이 구현할 수 있다.
            - 코드의 분리: 스레드와 실행할 작업을 분리하여 코드의 가독성을 높일 수 있다.
            - 여러 스레드가 동일한 Runnable 객체를 공유할 수 있어 자원 관리를 효율적으로 할 수 있다.
        단점
            - 코드가 약간 복잡해질 수 있다. Runnable 객체를 생성하고 이를 Thread에 전달하는 과정이 추가된다.
         */
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable); //작업을 넣을 수 있음. (메서드 별 작업 분리 가능)
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

}
