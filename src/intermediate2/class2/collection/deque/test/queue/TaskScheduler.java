package intermediate2.class2.collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public void processNextTesk() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute(); //new CompressionTask() 구현체가 들어옴 다른 구현체도 순서대로 들어와서 Override된 메서드가 실행됨.
        }
    }

    public int getRemainingTasks() {
        return tasks.size();
    }
}
