public class ThreadedProcess implements Runnable{
    public String threadId;
    @Override
    public void run() {
        System.out.println("Hello world in thread named " + threadId + "!");
    }
}
