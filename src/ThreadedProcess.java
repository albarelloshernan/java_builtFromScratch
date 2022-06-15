public class ThreadedProcess implements Runnable{
    public int counter;
    private final int rounds = 100000;
    @Override
    public void run() {
        for(int i = 0; i < rounds; i++) {
            counter++;
        }
    }
}
