public class Main {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        Thread3 th3 = new Thread3();

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        Thread t3 = new Thread(th3);
t1.start();
t2.run();
t3.run();
;
    }
}