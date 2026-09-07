package advanced1.thread.control;

import static advanced1.util.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        /*
        run 메서드 내 코드블럭을 모두 거치면 상태가 TERMINATED가 됨.
         */
        Thread thread = new Thread(new MyRunnable(), "myThread"); // 스레드 생성 후 아무 행동도 하지 않으면 NEW 상태.
        log("myThread.state1 = " + thread.getState()); //NEW (1)
        log("myThread.start()");
        thread.start(); // Runnable의 run 메서드 실행
        Thread.sleep(1000);
        log("myThread.state3 = " + thread.getState()); //TIMED_WAITING (3)
        Thread.sleep(4000);
        log("myThread.state5 = " + thread.getState()); //TERMINATED (5)
        log("end");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                log("start");
                log("myThread.state2 = " + Thread.currentThread().getState()); //RUNNABLE (2)
                log("sleep start");
                Thread.sleep(3000); //myThread
                log("sleep end");
                log("myThread.state4 = " + Thread.currentThread().getState()); //RUNNABLE (4)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
