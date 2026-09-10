package advanced1.thread.yield;

import static advanced1.util.ThreadUtils.sleep;

import advanced1.thread.start.HelloRunnable;

public class YieldMain {

    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                // 1. empty
                // sleep(1); // 2. sleep (RUNNABLE -> TIMED_WAITING -> RUNNABLE 로 변경되는 복잡한 과정을 거침. 특정 시간 만큼 스레드가 실행되지 않음.)
                Thread.yield(); // 3. yield (RUNNABLE 상태로 한 턴 기다림, sleep 보단 자주 실행됨.)
            }
        }
    }

}
