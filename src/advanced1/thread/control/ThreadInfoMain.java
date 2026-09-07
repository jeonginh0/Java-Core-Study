package advanced1.thread.control;

import static advanced1.util.MyLogger.log;

import advanced1.thread.start.HelloRunnable;

public class ThreadInfoMain {

    public static void main(String[] args) {
        // main 스레드 정보 출력
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() = " + mainThread.threadId()); // 고유 식별자 반환(JVM 내에서 각 스레드에 대해 유일함)
        log("mainThread.getName() = " + mainThread.getName()); // 스레드의 이름 반환
        log("mainThread.getPriority() = " + mainThread.getPriority()); // 스레드의 우선순위 반환 (1 가장 낮음, 10 가장 높음. default = 5)
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup()); // 스레드가 속한 스레드 그룹 반환
        log("mainThread.getState() = " + mainThread.getState()); // 스레드의 상태 반환. Thread.State Enum형에 정의된 상수 중 하나.

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());
    }

}
