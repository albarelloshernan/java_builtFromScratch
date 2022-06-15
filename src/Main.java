public class Main {
    public static void main(String[] args) {
        try{
            ThreadedProcess tp = new ThreadedProcess();
            Thread t1 = new Thread(tp, "Thread_1");
            Thread t2 = new Thread(tp, "Thread_2");
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(tp.counter);
        } catch (InterruptedException e) {
            System.out.println("Interrupted in Main!");
        }
    }
}