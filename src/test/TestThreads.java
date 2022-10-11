package test;

public class TestThreads {


    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        Thread one = new Thread(t1);
        ThreadTwo t2 = new ThreadTwo();
        Thread two = new Thread(t2);
        one.start();
        two.start();
    }
}

class Accum {
    private int counter = 0;
    private static Accum a = new Accum();

    private Accum() {}

    public static Accum getAccum() {
        return a;
    }

    public int getCount() {
        return counter;
    }

    public void updateCounter(int add) {
        counter += add;
    }
}

class ThreadOne implements Runnable {

    @Override
    public void run() {
        Accum a = Accum.getAccum();
        for (int x = 0; x < 98; x++) {
            a.updateCounter(1000);
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("one " + a.getCount());
    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        Accum a = Accum.getAccum();
        for (int x = 0; x < 99; x++) {
            a.updateCounter(1);
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("two " + a.getCount());
    }
}
