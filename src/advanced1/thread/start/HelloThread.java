package advanced1.thread.start;

public class HelloThread extends Thread {

    @Override
    public void run() {
        /*
        Thread 클래스를 상속(extend)하고, 스레드가 실행할 코드를 run() 메서드에 재정의
        Thread.currentThread()를 호출하면 해당 코드를 실행하는 스레드 객체를 조회할 수 있다.
        Thread.currentThread().getName(): 실행중인 스레드의 이름을 조회한다.
         */
        System.out.println(Thread.currentThread().getName() + ": run()");

    }

}
