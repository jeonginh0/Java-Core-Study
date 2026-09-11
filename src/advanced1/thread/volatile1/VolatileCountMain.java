package advanced1.thread.volatile1;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

public class VolatileCountMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        t.start();

        sleep(1000);

        task.flag = false;
        log("flag = " + task.flag + ", count = " + task.count + " in main");

    }

    static class MyTask implements Runnable {
        // boolean flag = true;
        // long count;

        volatile boolean flag = true;
        volatile long count;

        /*
        volatile이 없을 때: 약 11억
        volatile이 있을 때: 약 2.2억
        물리적으로 약 5배의 성능 차이. 키워드를 사용했을 때 성능이 상대적으로 떨어짐.
         */

        @Override
        public void run() {
            while (flag) {
                count ++;
                //1억번에 한번씩 출력
                if (count % 100_000_000 == 0) {
                    //주석 처리 한다면...
                    log("flag = " + flag + ", count = " + count + " in while()");
                }
            }
            log("flag = " + flag + ", count = " + count + " 종료");
        }
    }

}
