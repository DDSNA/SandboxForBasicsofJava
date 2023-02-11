package syntax.demo.loopsandfun;

public class MultithreadingExample extends Thread {
    private final int ThreadNumber;
    public MultithreadingExample(int threadNumber) {
        this.ThreadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int x = 1; x <= 20; x++) {
            System.out.println(x + "from thread number: " + ThreadNumber);
            if (ThreadNumber == 3) {
                throw new RuntimeException("Funkytime!!!!!! You got a three so it's a party in the threads! Also thread 3 stopped working");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
