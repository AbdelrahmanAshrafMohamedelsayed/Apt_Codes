public class Main extends Thread {
    public void run() {
        Count.getInstance();
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Main();
            t.start();
            t.join();
        }
        Count u = Count.getInstance();

        System.out.println(u.counter);
    }
}

class Count {

    private static volatile Count instance = null;

    public static int counter = 0;

    private Count() {
    }

    public static synchronized Count getInstance() {

                if (instance == null) {

                    instance = new Count();
                }
        return instance;
    }
    public synchronized static void increment() {
        counter++;
    }
}
