package advanced1.thread.printer;

import static advanced1.util.MyLogger.log;
import static advanced1.util.ThreadUtils.sleep;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyPrinter1 {

    /**
     * main Thread
     * - 사용자 입력을 받아서 Printer 인스턴스의 jobQueue에 담는다.
     */
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread printerThread = new Thread(printer, "printer1");
        printerThread.start();

        Scanner userInput = new Scanner(System.in);
        while (true) {
            log("프린터할 문서를 입력하세요. 종료(q): ");
            String input = userInput.nextLine();
            if (input.equals("q")) {
                printer.work = false;
                break;
            }
            printer.addJob(input);
        }
    }

    /**
     * printer Thread run
     * - jobQueue가 있는지 확인하고 내용이 있으면 poll()을 이용해 꺼낸 다음에 출력한다.
     * - 만약 jobQueue가 비었다면 continue를 사용해서 다시 while 문을 반복한다.
     */
    static class Printer implements Runnable {
        volatile boolean work = true;
        /*
        ConcurrentLinkedQueue: 여러 스레드가 동시에 접근하는 경우, 컬렉션 프레임워크가 제공하는 일반적인 자료구조를 사용하면 안전하지 않음.
        여러 스레드가 동시에 접근하는 경우 동시성을 지원하는 동시성 컬렉션을 사용해야 함. 여기서는 일반 큐이다.
         */
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();

        @Override
        public void run() {
            while (work) {
                if (jobQueue.isEmpty()) {
                    continue;
                }

                String job = jobQueue.poll();
                log("출력 시작: " + job + ", 대기 문서: " + jobQueue);
                sleep(3000);
                log("출력 완료");
            }
            log("프린터 종료");
        }

        public void addJob(String input) {
            jobQueue.offer(input);
        }
    }

}
