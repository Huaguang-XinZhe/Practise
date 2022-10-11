package test;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    private void go() {
        doMore();
    }

    private void doMore() {
        System.out.println("top's the stack");
    }
}

class ThreadTestDrive {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread thread = new Thread(threadJob);

        thread.start();

        System.out.println("back in main");
    }
}
