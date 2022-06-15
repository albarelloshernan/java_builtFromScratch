public class Main {
    public static void main(String[] args) {
        try{
            ThreadedProcess tp = new ThreadedProcess();
            Thread t1 = new Thread(tp, "Thread_1");
            Thread t2 = new Thread(tp, "Thread_2");
            Thread t3 = new Thread(tp, "Thread_3");
            Thread t4 = new Thread(tp, "Thread_4");
            Thread t5 = new Thread(tp, "Thread_5");
            tp.threadId = t1.getName();
            t1.start();
            t1.join();
            tp.threadId = t2.getName();
            t2.start();
            t2.join();
            tp.threadId = t3.getName();
            t3.start();
            t3.join();
            tp.threadId = t4.getName();
            t4.start();
            t4.join();
            tp.threadId = t5.getName();
            t5.start();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }
}