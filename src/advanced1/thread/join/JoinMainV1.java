package advanced1.thread.join;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class JoinMainV1 {

    public static void main(String[] args) {
        /*
        1부터 100까지 더하는 연산작업을 Thread1, Thread2로 나눠서 지시를 한다.
         */
        log("start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

        log("tast1.result = " + task1.result);
        log("tast2.result = " + task2.result);

        int sumAll = task1.result + task2.result;
        //스레드에서는 result에 연산 결과를 담을 때 까지 약 2초의 시간이 필요하다. main 스레드는 계산이 끝나기 전에 result 결과를 조회해서 0 값이 출력된다.
        log("task1 + task2 = " + sumAll);
        log("end");
    }

    static class SumTask implements Runnable {
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);

            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;

            log("작업 완료 result = " + result);
        }
    }

}
