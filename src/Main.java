public class Main {
    public static void main(String[] args) {
        ThreadedProcess t1, t2;
        t1 = new ThreadedProcess("Thread-1");
        t2 = new ThreadedProcess("Thread-2");
        t1.t.start();
        t2.t.start();
        try{
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted in Main!");
        }
    }
}