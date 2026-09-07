package advanced1.thread.join.test;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

import advanced1.thread.join.test.JoinTest1Main.MyTask;

public class JoinTest2Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t2");
        Thread t3 = new Thread(new MyTask(), "t3");

        t1.start(); //3초
        t2.start(); //3초
        t3.start(); //3초

        /*
        join() 위치를 아래로 내리면 하나씩 작업하지 않고 한번에 끝낼 수 있음.
         */
        t1.join(); //대기
        t2.join(); //대기
        t3.join(); //대기


        System.out.println("모든 스레드 실행 완료 3초 걸림.");
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }

}
