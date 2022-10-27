public class Thread2 implements Runnable{
    public void run() {
        System.out.println("Thread2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }

