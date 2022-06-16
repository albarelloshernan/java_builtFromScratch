import java.util.concurrent.atomic.AtomicInteger;

public class ThreadedProcess implements Runnable{
    public static final AtomicInteger counter = new AtomicInteger(0);
    public String message;
    public Thread t;

    public ThreadedProcess(String name) {
        t = new Thread(this);
        message = name;
    }

    @Override
    public void run() {
        printMsg(message);
    }

    private void printMsg(String message) {
        final int rounds = 10;
        int id;
        String name = Thread.currentThread().getName();
        id = name.equals("Thread-0") ? 1 : 2;
        for (int i = 0; i < rounds; i++) {
            synchronized (counter) {
                counter.incrementAndGet();
                System.out.println("Count: " + counter + " in Thread-" + id);
            }
        }
    }
}
