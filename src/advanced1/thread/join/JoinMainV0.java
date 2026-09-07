package advanced1.thread.join;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class JoinMainV0 {

    public static void main(String[] args) {
        log("start");
        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        thread1.start();
        thread2.start();

        log("end"); // 메인 스레드가 종료된 다음에 Job Runnable의 run 메서드가 시작되고 종료됐다.
    }

    static class Job implements Runnable {
        @Override
        public void run() {
            log("작업 시작");
            sleep(2000); //TIMED_WAITING 상태
            log("작업 완료");
        }
    }
}
