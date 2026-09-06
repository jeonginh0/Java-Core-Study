package advanced1.thread.start;

public class DaemonThreadMain {
    /*
    스레드는 사용자(User) 스레드와 데몬(Daemon) 스레드 2가지 종류로 구분할 수 있다.
    1. 사용자 스레드(Non-daemon 스레드)
        - 프로그램의 주요 작업을 수행한다.
        - 작업이 완료될 때 까지 실행된다.
        - 모든 user 스레드가 종료되면 JVM도 종료된다.
    2. 데몬 스레드(daemon 스레드)
        - 백그라운드에서 보조적인 작업을 수행한다.
        - 모든 user 스레드가 종료되면 데몬 스레드는 자동으로 종료된다.
     */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬 스레드 여부. start() 실행 전에 결정해야 한다.
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");
            try {
                Thread.sleep(10000); //10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }

}
