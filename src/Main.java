public class Main {
    public static void main(String[] args) {
        try{
            ThreadedProcess tp = new ThreadedProcess();
            Thread t1 = new Thread(tp, "Thread_1");
            Thread t2 = new Thread(tp, "Thread_2");
            Thread t3 = new Thread(tp, "Thread_3");
            Thread t4 = new Thread(tp, "Thread_4");
            Thread t5 = new Thread(tp, "Thread_5");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }
}