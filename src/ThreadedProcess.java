public class ThreadedProcess implements Runnable{
    public int counter;
    @Override
    public void run() {
        final int rounds = 10;
        int id;
        String name = Thread.currentThread().getName();
        id = name.equals("Thread_1") ? 1 : 2;
        for (int i = 0; i < rounds; i++) {
            synchronized (this) {
                counter++;
                System.out.println("ThreadId: " + id);
            }
        }
    }
}
