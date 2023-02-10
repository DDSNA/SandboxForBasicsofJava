package syntax.demo.loopsandfun;

public class MultithreadingExample extends Thread {
    private int ThreadNumber;
    public MultithreadingExample(int threadNumber) {
        this.ThreadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int x = 1; x <= 20; x++) {
            System.out.println(x + "from thread number: " + ThreadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
