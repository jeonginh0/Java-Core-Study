package advanced1.thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        /*
        메서드를 실행하며 스택 위에 프레임이 쌓인다.
        main 스레드는 main() 메서드의 스택 프레임을 스택에 올리면서 시작한다.
        직접 만드는 스레드는 run() 메서드의 스택 프레임을 스택에 올리면서 run() 메서드를 시작한다.
         */
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

}
