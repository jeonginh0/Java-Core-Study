package advanced1.thread.volatile1;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class VolatileFlagMain {

    /*
    CPU는 처리 성능을 개선하기 위해 중간에 캐시 메모리라는 것을 사용한다.
    메인 메모리는 CPU 입장에서 보면 거리도 멀고, 속도도 상대적으로 느린데, 대신에 상대적으로 가격이 저렴해서 큰 용량을 쉽게 구성할 수 있다.

    1. 각 스레드가 runFlag의 값을 사용하면 CPU는 이 값을 효율적으로 처리하기 위해 캐시 메모리에 불러온다.
    2. 이후에는 캐시 메모리에 있는 runFlag를 사용하게 된다.
    3. 프로그램 시작 시점에는 runFlag를 변경하지 않기 때문에 모든 스레드에서 true의 값을 읽는다.
    4. main 스레드는 runFlag를 false로 설정한다. 이때 캐시 메모리의 runFlag가 false로 설정된다.
    캐시 메모리를 메인에 반영하거나, 메인 메모리의 변경 내역을 캐시 메모리에 다시 불러오는건 언제 발생?
    -> CPU 설계 방식과 실행 환경에 따라 달라질 수 있다. 즉시 반영될 수 있고, 몇 밀리초 후에 될 수도 있고, 안될수도 있다.
    -> 주로 컨텍스트 스위칭이 될 때 반영되긴 함.

    메모리 가시성 문제
    : 멀티스레드 환경에서 한 스레드가 변경한 값이 다른 스레드에서 언제 보이는지에 대한 문제를 메모리 가시성이라 한다.
     */
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag);
        t.start();

        sleep(1000);
        log("runFlag를 false로 변경 시도");
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {

        // boolean runFlag = true;

        // (volatile) runFlag에 대해서는 캐시 메모리를 사용하지 않고 값을 읽거나 쓸 때 항상 메인 메모리에서 접근한다.
        // 여러 스레드에서 같은 값을 읽고 써야 한다면 키워드 사용!
        // 단, 캐시 메모리를 사용할 때 보다 성능이 느려지는 단점이 있기 때문에 꼭 필요한 곳에만 사용해야 한다.
        volatile boolean runFlag = true;

        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {
                // runFlag가 false로 변하면 탈출
            }
            log("task 종료");
        }
    }
}
