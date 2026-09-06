package advanced1.thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        /*
        스레드의 start() 메서드는 스레드에 스택 공간을 할당하면서 스레드를 시작하는 아주 특별한 메서드.
        따라서 main 스레드가 아닌 별도의 스레드에서 재정의한 run() 메서드를 실행하려면 반드시 start() 메서드를 호출해야 함.
         */
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.run(); // main 스레드가 run을 호출한게 된다. 별도의 스레드를 호출한 게 아니게 됨.
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

}
