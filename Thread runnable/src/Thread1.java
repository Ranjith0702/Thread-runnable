public class Thread1 implements Runnable{
    public void run() {
        System.out.println("Thread1");
        try {
            Thread.sleep(1000);
        }
         catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
